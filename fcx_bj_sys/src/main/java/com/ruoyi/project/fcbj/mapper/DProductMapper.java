package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DProduct;

/**
 * 险类-险种Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DProductMapper 
{
    /**
     * 查询险类-险种
     * 
     * @param productType 险类-险种主键
     * @return 险类-险种
     */
    public DProduct selectDProductByProductType(String productType);

    /**
     * 查询险类-险种列表
     * 
     * @param dProduct 险类-险种
     * @return 险类-险种集合
     */
    public List<DProduct> selectDProductList(DProduct dProduct);

    /**
     * 新增险类-险种
     * 
     * @param dProduct 险类-险种
     * @return 结果
     */
    public int insertDProduct(DProduct dProduct);

    /**
     * 修改险类-险种
     * 
     * @param dProduct 险类-险种
     * @return 结果
     */
    public int updateDProduct(DProduct dProduct);

    /**
     * 删除险类-险种
     * 
     * @param productType 险类-险种主键
     * @return 结果
     */
    public int deleteDProductByProductType(String productType);

    /**
     * 批量删除险类-险种
     * 
     * @param productTypes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDProductByProductTypes(String[] productTypes);
}
