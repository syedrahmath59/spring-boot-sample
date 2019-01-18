package sample.city;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class City {

    @Id
    public Integer id;

    public String name;

    @Override
    public String toString() {
        return "City [id=" + id + ", name=" + name + "]";
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    

}
