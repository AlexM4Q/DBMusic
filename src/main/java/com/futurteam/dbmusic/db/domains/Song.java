package com.futurteam.dbmusic.db.domains;

import com.futurteam.dbmusic.db.domains.base.NamedEntity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

public final class Song extends NamedEntity {

    @Getter
    @Setter
    private int albumId;

    @Getter
    @Setter
    private int artistId;

    @Getter
    @Setter
    private int partnerId;

    @Getter
    @Setter
    private int distributorId;

    @Getter
    @Setter
    private String genre;

    @Getter
    @Setter
    private Date releaseDate;

}
