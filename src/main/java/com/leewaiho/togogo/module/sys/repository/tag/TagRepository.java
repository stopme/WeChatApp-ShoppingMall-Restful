package com.leewaiho.togogo.module.sys.repository.tag;

import com.leewaiho.togogo.common.base.repository.BaseRepository;
import com.leewaiho.togogo.module.sys.model.product.TBProduct;
import com.leewaiho.togogo.module.sys.model.tag.TBTag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * Author leewaiho
 * Email 791783391@qq.com
 * Date 2017/9/20
 * Project togogo-shixun
 */
@Repository
public interface TagRepository extends BaseRepository<TBTag> {
    
    Page<TBTag> findAllByTypeContains(String type, Pageable pageable);
    
    Page<TBTag> findAllByTypeAndProductsContains(String type, TBProduct product, Pageable pageable);
    
}
