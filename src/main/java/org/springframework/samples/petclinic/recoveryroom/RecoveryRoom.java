package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/*
*/

@Getter
@Setter
@Entity
@Table(name = "recovery_room")
public class RecoveryRoom extends BaseEntity{
    //Integer id;
    
    @NotBlank
	@Length(min = 3, max = 50)
	@Column(name = "name")
    String name;
    
    @NotNull
	@PositiveOrZero
	@Column(name = "size")
    double size;
   
    @Column(name = "secure")
    @NotNull
    boolean secure;
    
    
    @Transient
    RecoveryRoomType roomType;
}
