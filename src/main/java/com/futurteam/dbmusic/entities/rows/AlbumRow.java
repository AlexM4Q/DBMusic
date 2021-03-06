package com.futurteam.dbmusic.entities.rows;

import com.futurteam.dbmusic.db.domains.Album;
import com.futurteam.dbmusic.entities.rows.base.NamedEntityRow;
import javafx.beans.property.SimpleStringProperty;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.sql.Date;

public final class AlbumRow extends NamedEntityRow {

    @Getter
    @NotNull
    private final Album entity;

    @NotNull
    private final SimpleStringProperty partnerId;

    @NotNull
    private final SimpleStringProperty distributorId;

    @NotNull
    private final SimpleStringProperty genre;

    @NotNull
    private final SimpleStringProperty releaseDate;

    @NotNull
    private final SimpleStringProperty songsCount;

    public AlbumRow(@NotNull final Album entity) {
        super(entity);
        this.entity = entity;
        this.partnerId = new SimpleStringProperty(String.valueOf(entity.getPartnerId()));
        this.distributorId = new SimpleStringProperty(String.valueOf(entity.getDistributorId()));
        this.genre = new SimpleStringProperty(String.valueOf(entity.getGenre()));
        this.releaseDate = new SimpleStringProperty(String.valueOf(entity.getReleaseDate()));
        this.songsCount = new SimpleStringProperty(String.valueOf(entity.getSongsCount()));
    }

    public String getPartnerId() {
        return partnerId.get();
    }

    public void setPartnerId(final String partnerId) {
        this.entity.setPartnerId(Integer.valueOf(partnerId));
        this.partnerId.set(partnerId);
    }

    public String getDistributorId() {
        return distributorId.get();
    }

    public void setDistributorId(final String distributorId) {
        this.entity.setDistributorId(Integer.valueOf(distributorId));
        this.distributorId.set(distributorId);
    }

    public String getGenre() {
        return genre.get();
    }

    public void setGenre(final String genre) {
        this.entity.setGenre(genre);
        this.genre.set(genre);
    }

    public String getReleaseDate() {
        return releaseDate.get();
    }

    public void setReleaseDate(final String releaseDate) {
        this.entity.setReleaseDate(Date.valueOf(releaseDate));
        this.releaseDate.set(releaseDate);
    }

    public String getSongsCount() {
        return songsCount.get();
    }

    public void setSongsCount(final String songsCount) {
        this.entity.setSongsCount(Integer.valueOf(songsCount));
        this.songsCount.set(songsCount);
    }

}
