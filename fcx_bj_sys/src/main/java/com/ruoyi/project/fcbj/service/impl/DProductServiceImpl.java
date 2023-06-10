package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DProductMapper;
import com.ruoyi.project.fcbj.domain.DProduct;
import com.ruoyi.project.fcbj.service.IDProductService;

/**
 * 险类-险种Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DProductServiceImpl implements IDProductService 
{
    @Autowired
    private DProductMapper dProductMapper;

    /**
     * 查询险类-险种
     * 
     * @param productType 险类-险种主键
     * @return 险类-险种
     */
    @Override
    public DProduct selectDProductByProductType(String productType)
    {
        return dProductMapper.selectDProductByProductType(productType);
    }

    /**
     * 查询险类-险种列表
     * 
     * @param dProduct 险类-险种
     * @return 险类-险种
     */
    @Override
    public List<DProduct> selectDProductList(DProduct dProduct)
    {
        return dProductMapper.selectDProductList(dProduct);
    }

    /**
     * 新增险类-险种
     * 
     * @param dProduct 险类-险种
     * @return 结果
     */
    @Override
    public int insertDProduct(DProduct dProduct)
    {
        return dProductMapper.insertDProduct(dProduct);
    }

    /**
     * 修改险类-险种
     * 
     * @param dProduct 险类-险种
     * @return 结果
     */
    @Override
    public int updateDProduct(DProduct dProduct)
    {
        return dProductMapper.updateDProduct(dProduct);
    }

    /**
     * 批量删除险类-险种
     * 
     * @param productTypes 需要删除的险类-险种主键
     * @return 结果
     */
    @Override
    public int deleteDProductByProductTypes(String[] productTypes)
    {
        return dProductMapper.deleteDProductByProductTypes(productTypes);
    }

    /**
     * 删除险类-险种信息
     * 
     * @param productType 险类-险种主键
     * @return 结果
     */
    @Override
    public int deleteDProductByProductType(String productType)
    {
        return dProductMapper.deleteDProductByProductType(productType);
    }
}
