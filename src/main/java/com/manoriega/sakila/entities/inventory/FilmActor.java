package com.manoriega.sakila.entities.inventory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film_actor")
@AssociationOverrides({
        @AssociationOverride(name = "actor",
                joinColumns = @JoinColumn(name = "actor_id")),
        @AssociationOverride(name = "film",
                joinColumns = @JoinColumn(name = "film_id")
        )
})
public class FilmActor {

    @EmbeddedId
    private FilmActorId filmActorId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Actor actor;

    @ManyToOne(fetch = FetchType.EAGER)
    private Film film;

    @Column(name = "last_update")
    private Date lastUpdate;
}
