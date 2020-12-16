package com.zhibang.service.system;

import com.zhibang.model.SyArea;
import com.zhibang.model.SyEmp;

import java.util.List;

public interface SystemService {
    public SyEmp selectEepById(SyEmp syEmp);
    public List<SyArea> selectSy_area();
}
