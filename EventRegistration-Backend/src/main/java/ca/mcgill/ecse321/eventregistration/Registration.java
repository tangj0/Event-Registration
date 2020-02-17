package ca.mcgill.ecse321.eventregistration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Set;
import javax.persistence.ManyToMany;

@Entity
public class Registration{
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
   private Event event;
   
   @ManyToOne(optional=false)
   public Event getEvent() {
      return this.event;
   }
   
   public void setEvent(Event event) {
      this.event = event;
   }
   
   private RegistrationManager registrationManager;
   
   @ManyToOne(optional=false)
   public RegistrationManager getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(RegistrationManager registrationManager) {
      this.registrationManager = registrationManager;
   }
   
   private Set<Person> particiant;
   
   @ManyToMany
   public Set<Person> getParticiant() {
      return this.particiant;
   }
   
   public void setParticiant(Set<Person> particiants) {
      this.particiant = particiants;
   }
   
   }
