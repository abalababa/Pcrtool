package cn.sciuridae.dataBase.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.annotation.Version;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author sciuridae
 * @since 2020-06-02
 */
@TableName("progress")
public class Progress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Long teamQQ;

    private Integer loop;

    private Integer serial;

    private Integer Remnant;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
    @TableLogic
    private Integer deleted = 0;
    @Version
    private Integer version;

    public Progress() {
    }

    public Progress(Integer id, Long teamQQ, Integer loop, Integer serial, Integer remnant, LocalDateTime startTime, LocalDateTime endTime, Integer deleted, Integer version) {
        this.id = id;
        this.teamQQ = teamQQ;
        this.loop = loop;
        this.serial = serial;
        Remnant = remnant;
        this.startTime = startTime;
        this.endTime = endTime;
        this.deleted = deleted;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTeamQQ() {
        return teamQQ;
    }

    public void setTeamQQ(Long teamQQ) {
        this.teamQQ = teamQQ;
    }

    public Integer getLoop() {
        return loop;
    }

    public void setLoop(Integer loop) {
        this.loop = loop;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public Integer getRemnant() {
        return Remnant;
    }

    public void setRemnant(Integer Remnant) {
        this.Remnant = Remnant;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Progress{" +
                "id=" + id +
                ", teamQQ=" + teamQQ +
                ", loop=" + loop +
                ", serial=" + serial +
                ", Remnant=" + Remnant +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", deleted=" + deleted +
                ", version=" + version +
                "}";
    }
}
