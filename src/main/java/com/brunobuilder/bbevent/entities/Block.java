package com.brunobuilder.bbevent.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start_block;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant end_block;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block() {
    }

    public Block(Integer id, Instant start_block, Instant end_block, Activity activity) {
        this.id = id;
        this.start_block = start_block;
        this.end_block = end_block;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart_block() {
        return start_block;
    }

    public void setStart_block(Instant start_block) {
        this.start_block = start_block;
    }

    public Instant getEnd_block() {
        return end_block;
    }

    public void setEnd_block(Instant end_block) {
        this.end_block = end_block;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
