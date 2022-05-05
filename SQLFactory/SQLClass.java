import java.lang.reflect.*;

public abstract class SQLClass {
    private String tableName;
    private String listFields;
    private String listValues;    

    public void setTableName(String tableName){
        this.tableName = tableName;
    }
    
    public String selectSQL(){
        return "select * from "+this.tableName;
    }

    private String getValueField(Field field) throws Exception{
        Object valueObject = field.get(this);  
        String value = "";
        
        if (field.getType() == String.class) {
            value = "'"+valueObject+"'";
        } else {
            value = value + valueObject;
        }

        return value;
    }

    private void listAllFields(){        
        Field[] fields = this.getClass().getDeclaredFields();
        
        String fieldList = "";
        String valueList = "";

        for (Field field : fields) {
            fieldList = fieldList + ", " + field.getName();
           
            try {
                valueList = valueList + ", " + getValueField(field);    
            } catch (Exception e) {
                e.printStackTrace();
            }            
        }

        this.listFields = fieldList.substring(1);
        this.listValues = valueList.substring(1);

    }

    public String insertSQL(){
        listAllFields();
        String sql;
        
        sql = "insert into "+this.tableName;
        sql = sql + " ("+ this.listFields + ")";
        sql = sql + " values (" + this.listValues + ")";

        return sql;
    }
}