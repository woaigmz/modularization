package com.credithc.hhr.module_project.view.fragment;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.credithc.hhr.library_common.config.ARouterConstant;

import com.credithc.hhr.module_project.R;
import com.woaiqw.base.common.BaseFragment;

/**
 * Created by haoran on 2018/7/26.
 */
@Route(path = ARouterConstant.project_fragment_router_path)
public class ProjectFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.project_fragment_project;
    }

    @Override
    protected void afterCreate(Bundle bundle) {

    }
}
