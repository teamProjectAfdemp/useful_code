import org.json.simple.JSONObject;


public String toString(boolean toJSON) {
        JSONObject emp = new JSONObject();
        
        if(toJSON) {
            emp.put("location", this.getLocation());
            emp.put("name", this.getName());
            emp.put("id", this.getId());
            return emp.toJSONString();
        }
        else
            return "Employee: [id = " + this.getId() + ", " + "Name = " + this.getName() + ", " + "Location = " + this.getLocation() + "]";
    }