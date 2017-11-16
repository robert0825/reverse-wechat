package com.tencent.mm.plugin.gallery.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.v;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class c
  extends v
{
  private Bitmap erM;
  ArrayList<GalleryItem.MediaItem> lCi;
  ArrayList<String> lDE;
  boolean lDF;
  HashSet<String> lDG;
  int lDH;
  View lDI;
  boolean lDJ;
  private HashMap<String, WeakReference<b>> lDK;
  public e lDL;
  public d lDM;
  public Context mContext;
  
  public c(Context paramContext)
  {
    GMTrace.i(11960007524352L, 89109);
    this.lDE = new ArrayList();
    this.lCi = new ArrayList();
    this.lDG = new HashSet();
    this.lDH = -1;
    this.lDI = null;
    this.lDJ = false;
    this.erM = null;
    this.lDK = new HashMap();
    this.lDL = new e(this);
    this.lDM = new d(this);
    this.mContext = paramContext;
    GMTrace.o(11960007524352L, 89109);
  }
  
  @TargetApi(11)
  static void a(MultiTouchImageView paramMultiTouchImageView, Bitmap paramBitmap)
  {
    GMTrace.i(11960812830720L, 89115);
    paramMultiTouchImageView.aw(4.5F);
    paramMultiTouchImageView.qbc = false;
    if (Build.VERSION.SDK_INT == 20) {
      paramMultiTouchImageView.setLayerType(1, null);
    }
    for (;;)
    {
      paramMultiTouchImageView.eo(paramBitmap.getWidth(), paramBitmap.getHeight());
      paramMultiTouchImageView.setImageBitmap(paramBitmap);
      paramMultiTouchImageView.requestLayout();
      GMTrace.o(11960812830720L, 89115);
      return;
      k.i(paramMultiTouchImageView, paramBitmap.getWidth(), paramBitmap.getHeight());
    }
  }
  
  public final void E(ArrayList<String> paramArrayList)
  {
    GMTrace.i(11960141742080L, 89110);
    this.lDE.clear();
    this.lDE = new ArrayList();
    this.lDE.addAll(paramArrayList);
    reset();
    notifyDataSetChanged();
    GMTrace.o(11960141742080L, 89110);
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    GMTrace.i(15300149903360L, 113995);
    if (!this.lDF)
    {
      if (paramObject == null)
      {
        w.e("MicroMsg.ImageAdapter", "[destroyItem] position:%s", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(15300149903360L, 113995);
        return;
      }
      if (this.lDI != null) {
        w.i("MicroMsg.ImageAdapter", "[destroyItem] position:%s object:%s lastVisableView:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramObject.hashCode()), Integer.valueOf(this.lDI.hashCode()) });
      }
      if ((paramObject != this.lDI) || (!this.lDJ))
      {
        super.a(paramViewGroup, paramInt, paramObject);
        paramViewGroup.removeView((View)paramObject);
        GMTrace.o(15300149903360L, 113995);
        return;
      }
      w.d("MicroMsg.ImageAdapter", "[isSwap-destroyItem]");
      GMTrace.o(15300149903360L, 113995);
      return;
    }
    super.a(paramViewGroup, paramInt, paramObject);
    GMTrace.o(15300149903360L, 113995);
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(15300015685632L, 113994);
    if (!this.lDF)
    {
      w.i("MicroMsg.ImageAdapter", "[instantiateItem] position:%s %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lDH) });
      if ((paramInt == this.lDH) && (this.lDJ))
      {
        w.d("MicroMsg.ImageAdapter", "[isSwap-instantiateItem]");
        this.wgm.put(this.lDI, Integer.valueOf(this.lDH));
        this.wgn.put(this.lDH, this.lDI);
        this.lDH = -1;
        this.lDJ = false;
        paramViewGroup = this.lDI;
        GMTrace.o(15300015685632L, 113994);
        return paramViewGroup;
      }
      paramViewGroup = super.b(paramViewGroup, paramInt);
      GMTrace.o(15300015685632L, 113994);
      return paramViewGroup;
    }
    paramViewGroup = super.b(paramViewGroup, paramInt);
    GMTrace.o(15300015685632L, 113994);
    return paramViewGroup;
  }
  
  public final void detach()
  {
    GMTrace.i(11961081266176L, 89117);
    super.detach();
    d locald = this.lDM;
    locald.lEd = null;
    locald.lDX.clear();
    locald.lEa.clear();
    locald.lDZ.clear();
    locald.lDY.clear();
    locald.aDz();
    GMTrace.o(11961081266176L, 89117);
  }
  
  public final int getCount()
  {
    GMTrace.i(11960275959808L, 89111);
    if (this.lDF)
    {
      i = this.lCi.size();
      GMTrace.o(11960275959808L, 89111);
      return i;
    }
    int i = this.lDE.size();
    GMTrace.o(11960275959808L, 89111);
    return i;
  }
  
  public final String iH(int paramInt)
  {
    GMTrace.i(11960544395264L, 89113);
    if (this.lDF)
    {
      if ((paramInt < 0) || (paramInt >= this.lCi.size()))
      {
        w.w("MicroMsg.ImageAdapter", "error position %d, mediaitems size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lCi.size()) });
        GMTrace.o(11960544395264L, 89113);
        return "";
      }
      str = ((GalleryItem.MediaItem)this.lCi.get(paramInt)).gVn;
      GMTrace.o(11960544395264L, 89113);
      return str;
    }
    if ((paramInt < 0) || (paramInt >= this.lDE.size()))
    {
      w.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lDE.size()) });
      GMTrace.o(11960544395264L, 89113);
      return "";
    }
    String str = (String)this.lDE.get(paramInt);
    GMTrace.o(11960544395264L, 89113);
    return str;
  }
  
  public final MultiTouchImageView os(int paramInt)
  {
    GMTrace.i(11960410177536L, 89112);
    Object localObject = super.Cd(paramInt);
    if (localObject == null)
    {
      w.e("MicroMsg.ImageAdapter", "position : %s getMultiTouchImageViewByPosition is null", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11960410177536L, 89112);
      return null;
    }
    if ((localObject == null) || (((View)localObject).getVisibility() == 8))
    {
      GMTrace.o(11960410177536L, 89112);
      return null;
    }
    localObject = ((View)localObject).findViewById(R.h.image);
    if (localObject == null)
    {
      GMTrace.o(11960410177536L, 89112);
      return null;
    }
    localObject = (MultiTouchImageView)localObject;
    GMTrace.o(11960410177536L, 89112);
    return (MultiTouchImageView)localObject;
  }
  
  public final GalleryItem.MediaItem ot(int paramInt)
  {
    Object localObject2 = null;
    GMTrace.i(11960678612992L, 89114);
    if (this.lDF)
    {
      if ((paramInt < 0) || (paramInt >= this.lCi.size()))
      {
        w.w("MicroMsg.ImageAdapter", "error position %d mediaitems size", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lCi.size()) });
        GMTrace.o(11960678612992L, 89114);
        return null;
      }
      localObject1 = (GalleryItem.MediaItem)this.lCi.get(paramInt);
      GMTrace.o(11960678612992L, 89114);
      return (GalleryItem.MediaItem)localObject1;
    }
    if ((paramInt < 0) || (paramInt >= this.lDE.size()))
    {
      w.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lDE.size()) });
      GMTrace.o(11960678612992L, 89114);
      return null;
    }
    String str = (String)this.lDE.get(paramInt);
    Object localObject1 = localObject2;
    if (com.tencent.mm.plugin.gallery.model.c.aCN() != null)
    {
      localObject1 = GalleryItem.MediaItem.a(0, 0L, str, str, "");
      paramInt = com.tencent.mm.plugin.gallery.model.c.aCN().indexOf(localObject1);
      localObject1 = localObject2;
      if (paramInt >= 0) {
        localObject1 = (GalleryItem.MediaItem)com.tencent.mm.plugin.gallery.model.c.aCN().get(paramInt);
      }
    }
    GMTrace.o(11960678612992L, 89114);
    return (GalleryItem.MediaItem)localObject1;
  }
  
  public final void release()
  {
    GMTrace.i(11960947048448L, 89116);
    detach();
    this.lDK.clear();
    this.lDG.clear();
    GMTrace.o(11960947048448L, 89116);
  }
  
  final class a
    implements View.OnClickListener
  {
    private String filePath;
    
    public a(String paramString)
    {
      GMTrace.i(11924305608704L, 88843);
      this.filePath = paramString;
      GMTrace.o(11924305608704L, 88843);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11924439826432L, 88844);
      paramView = new Intent();
      paramView.setAction("android.intent.action.VIEW");
      paramView.setDataAndType(Uri.fromFile(new File(this.filePath)), "video/*");
      try
      {
        c.this.mContext.startActivity(paramView);
        GMTrace.o(11924439826432L, 88844);
        return;
      }
      catch (Exception paramView)
      {
        GMTrace.o(11924439826432L, 88844);
      }
    }
  }
  
  static final class b
  {
    MultiTouchImageView lDO;
    TextView lDP;
    ImageView lkf;
    
    b()
    {
      GMTrace.i(11957860040704L, 89093);
      GMTrace.o(11957860040704L, 89093);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */