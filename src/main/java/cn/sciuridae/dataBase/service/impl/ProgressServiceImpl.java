package cn.sciuridae.dataBase.service.impl;

import cn.sciuridae.dataBase.bean.Progress;
import cn.sciuridae.dataBase.dao.ProgressMapper;
import cn.sciuridae.dataBase.service.ProgressService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sciuridae
 * @since 2020-06-02
 */
@Service
public class ProgressServiceImpl extends ServiceImpl<ProgressMapper, Progress> implements ProgressService {
    @Autowired
    ProgressMapper progressMapper;


    @Override
    public Integer isFight(long group) {
        return progressMapper.getFight(group);
    }

    @Override
    public Progress getProgress(long Groupqq) {
        QueryWrapper<Progress> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("teamQQ", Groupqq);

        return progressMapper.selectOne(queryWrapper);
    }

    @Override
    public int endFight(long Groupqq) {
        QueryWrapper<Progress> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("teamQQ", Groupqq);
        return progressMapper.delete(queryWrapper);
    }

    @Override
    public int updateFight(Progress progress) {
        return progressMapper.updataProgress(progress.getTeamQQ(), progress.getLoop(), progress.getSerial(), progress.getRemnant(), progress.getEndTime(), progress.getStartTime());
    }

    @Override
    public List<Long> getEnd(LocalDateTime thisDay) {
        return progressMapper.getEnd(thisDay);
    }
}
