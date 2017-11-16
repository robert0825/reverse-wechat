package com.tencent.mm.plugin.gallery.model;

import java.util.ArrayList;

public abstract interface g
{
  public abstract ArrayList<GalleryItem.MediaItem> a(String paramString, int paramInt, c paramc, long paramLong);
  
  public abstract ArrayList<GalleryItem.AlbumItem> aDf();
  
  public abstract void aDg();
  
  public static abstract interface a
  {
    public abstract void A(ArrayList<GalleryItem.AlbumItem> paramArrayList);
  }
  
  public static abstract interface b
  {
    public abstract void a(ArrayList<GalleryItem.MediaItem> paramArrayList, long paramLong);
  }
  
  public static abstract interface c
  {
    public abstract void a(ArrayList<GalleryItem.MediaItem> paramArrayList, long paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */