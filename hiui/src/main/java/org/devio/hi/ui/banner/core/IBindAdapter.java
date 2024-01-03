package org.devio.hi.ui.banner.core;

/**
 * HiBanner的数据绑定接口，基于该接口可以实现数据的绑定和框架层解耦
 */
public interface IBindAdapter {
    // 接口里面不应该直接用HiBannerViewHolder，
    // 而是应该定义一个IBannerViewHolder接口，让HiBannerViewHolder实现该接口, 最终变成
    //  void onBind(IBannerViewHolder viewHolder, HiBannerMo mo, int position);
    void onBind(HiBannerAdapter.HiBannerViewHolder viewHolder, HiBannerMo mo, int position);
}
