package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PIntArray;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMHorList;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

public class FilterImageView
  extends LinearLayout
{
  static c[] xgY;
  private Activity eNu;
  int ppl;
  int[] xgP;
  View xgQ;
  ImageView xgR;
  CropImageView xgS;
  Bitmap xgT;
  private MMHorList xgU;
  private a xgV;
  Runnable xgW;
  Runnable xgX;
  
  static
  {
    GMTrace.i(1927769227264L, 14363);
    xgY = new c[] { new c(new b("原图", "原圖", "Normal"), "icon.png", 0, 0, "MatteOrigin.jpg", 0), new c(new b("LOMO", "LOMO", "LOMO"), "nuowei_mask%02d.jpg", 2, 1, "0004.jpg", 2), new c(new b("麦田", "麥田", "Wheat"), "0062_%02d.jpg", 2, 2, "0062.jpg", 20), new c(new b("玻璃镜", "玻璃鏡", "Glossy"), "habi_mask%02d.jpg", 1, 3, "0005.jpg", 4), new c(new b("拍立得", "拍立得", "Polaroid"), "0063_%02d.jpg", 2, 4, "0063.jpg", 21), new c(new b("湖水", "湖水", "Lake"), "0061_%02d.jpg", 1, 5, "0061.jpg", 19), new c(new b("黄昏", "黃昏", "Twilight"), "0030_mask%01d.jpg", 1, 6, "0030.jpg", 7), new c(new b("黑白", "黑白", "B&W"), "0065_%02d.jpg", 1, 7, "0065.jpg", 22), new c(new b("铜版画", "銅版畫", "Aquatint"), "0032_mask%01d.jpg", 1, 8, "0032.jpg", 9), new c(new b("圆珠笔", "圓珠筆", "Pen"), "0035_mask%01d.jpg", 1, 9, "0035.jpg", 18), new c(new b("海报", "海報", "Poster"), "0036_mask%01d.jpg", 0, 10, "0036.jpg", 17), new c(new b("素描", "素描", "Portrait"), "icon.jpg", 0, 11, "0040.jpg", 12) };
    GMTrace.o(1927769227264L, 14363);
  }
  
  public FilterImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1926829703168L, 14356);
    this.ppl = 0;
    this.eNu = ((Activity)paramContext);
    paramContext = View.inflate(this.eNu, a.h.geR, this);
    this.xgS = ((CropImageView)paramContext.findViewById(a.g.gdd));
    this.xgR = ((ImageView)paramContext.findViewById(a.g.bsI));
    this.xgQ = paramContext.findViewById(a.g.bsC);
    this.xgS.setOnTouchListener(null);
    this.xgU = ((MMHorList)paramContext.findViewById(a.g.bsz));
    this.xgV = new a();
    this.xgU.setAdapter(this.xgV);
    this.xgU.invalidate();
    this.xgU.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1922803171328L, 14326);
        paramAnonymousAdapterView = FilterImageView.a(FilterImageView.this);
        paramAnonymousAdapterView.mDH = paramAnonymousInt;
        paramAnonymousAdapterView.notifyDataSetChanged();
        try
        {
          FilterImageView.a(FilterImageView.this, FilterImageView.xgY[paramAnonymousInt].xhj);
          FilterImageView.a(FilterImageView.this, FilterImageView.xgY[paramAnonymousInt].xhg, FilterImageView.xgY[paramAnonymousInt].xhh, FilterImageView.xgY[paramAnonymousInt].xhi);
          GMTrace.o(1922803171328L, 14326);
          return;
        }
        catch (Exception paramAnonymousAdapterView)
        {
          w.e("MicroMsg.FilterView", paramAnonymousAdapterView.toString());
          w.printErrStackTrace("MicroMsg.FilterView", paramAnonymousAdapterView, "", new Object[0]);
          GMTrace.o(1922803171328L, 14326);
          return;
        }
        catch (OutOfMemoryError paramAnonymousAdapterView)
        {
          w.e("MicroMsg.FilterView", paramAnonymousAdapterView.toString());
          w.printErrStackTrace("MicroMsg.FilterView", paramAnonymousAdapterView, "", new Object[0]);
          GMTrace.o(1922803171328L, 14326);
        }
      }
    });
    GMTrace.o(1926829703168L, 14356);
  }
  
  private boolean aa(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(19116630999040L, 142430);
    if (paramInt2 == 0)
    {
      this.xgT.setPixels(this.xgP, 0, this.xgT.getWidth(), 0, 0, this.xgT.getWidth(), this.xgT.getHeight());
      this.xgS.invalidate();
      GMTrace.o(19116630999040L, 142430);
      return true;
    }
    int j = this.xgT.getWidth() * this.xgT.getHeight();
    w.d("MicroMsg.FilterView", "len:" + j + "  maskCount:" + paramInt1);
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { paramInt1, j });
    int i = 0;
    while (i < paramInt1)
    {
      Object localObject3 = String.format(paramString, new Object[] { Integer.valueOf(i) });
      Object localObject2 = null;
      Object localObject1 = null;
      Object localObject4;
      try
      {
        localObject3 = this.eNu.getAssets().open("filter/" + (String)localObject3);
        localObject1 = localObject3;
        localObject2 = localObject3;
        localObject4 = new byte[j];
        localObject1 = localObject3;
        localObject2 = localObject3;
        ((InputStream)localObject3).read((byte[])localObject4);
        localObject1 = localObject3;
        localObject2 = localObject3;
        localObject4 = d.bg((byte[])localObject4);
        localObject1 = localObject3;
        localObject2 = localObject3;
        ((InputStream)localObject3).close();
        if (localObject3 != null) {
          ((InputStream)localObject3).close();
        }
        if (localObject4 == null)
        {
          GMTrace.o(19116630999040L, 142430);
          return false;
        }
      }
      catch (Exception paramString)
      {
        localObject2 = localObject1;
        throw paramString;
      }
      finally
      {
        if (localObject2 != null) {
          ((InputStream)localObject2).close();
        }
      }
      localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject4, this.xgT.getWidth(), this.xgT.getHeight(), true);
      if (localObject4 != localObject1)
      {
        w.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { localObject4.toString() });
        ((Bitmap)localObject4).recycle();
      }
      if (localObject1 == null)
      {
        GMTrace.o(19116630999040L, 142430);
        return false;
      }
      ((Bitmap)localObject1).getPixels(arrayOfInt[i], 0, ((Bitmap)localObject1).getWidth(), 0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      w.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { localObject1.toString() });
      ((Bitmap)localObject1).recycle();
      i += 1;
    }
    paramString = new PIntArray();
    w.e("MicroMsg.FilterView", "src.len:" + this.xgP.length);
    i = 0;
    while (i < arrayOfInt.length)
    {
      w.e("MicroMsg.FilterView", "mask[" + i + "].len:" + arrayOfInt[i].length);
      i += 1;
    }
    w.e("MicroMsg.FilterView", "before filter");
    ImgFilter.FilterInt(paramInt2, this.xgP, arrayOfInt, paramInt1, this.xgT.getWidth(), this.xgT.getHeight(), paramString);
    w.e("MicroMsg.FilterView", "after filter");
    this.xgT.setPixels(paramString.value, 0, this.xgT.getWidth(), 0, 0, this.xgT.getWidth(), this.xgT.getHeight());
    this.xgS.invalidate();
    GMTrace.o(19116630999040L, 142430);
    return true;
  }
  
  public final void dd(String paramString, int paramInt)
  {
    GMTrace.i(1926963920896L, 14357);
    w.i("MicroMsg.FilterView", "filePath before fiterBmp:" + paramString);
    if ((this.xgT == null) || (this.xgT.isRecycled())) {
      this.xgT = d.b(d.e(paramString, 480, 480, false), paramInt);
    }
    w.d("MicroMsg.FilterView", "filterBmp w:" + this.xgT.getWidth() + " h:" + this.xgT.getHeight());
    this.xgP = new int[this.xgT.getWidth() * this.xgT.getHeight()];
    this.xgT.getPixels(this.xgP, 0, this.xgT.getWidth(), 0, 0, this.xgT.getWidth(), this.xgT.getHeight());
    this.xgS.setImageBitmap(this.xgT);
    GMTrace.o(1926963920896L, 14357);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(1927098138624L, 14358);
    if (paramInt == 0)
    {
      this.xgV.notifyDataSetChanged();
      this.xgU.invalidate();
    }
    super.setVisibility(paramInt);
    GMTrace.o(1927098138624L, 14358);
  }
  
  final class a
    extends BaseAdapter
  {
    int mDH;
    
    a()
    {
      GMTrace.i(2016621363200L, 15025);
      this.mDH = 0;
      GMTrace.o(2016621363200L, 15025);
    }
    
    public final int getCount()
    {
      GMTrace.i(2016755580928L, 15026);
      int i = FilterImageView.xgY.length;
      GMTrace.o(2016755580928L, 15026);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(2016889798656L, 15027);
      FilterImageView.c localc = FilterImageView.xgY[paramInt];
      GMTrace.o(2016889798656L, 15027);
      return localc;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2017024016384L, 15028);
      long l = paramInt;
      GMTrace.o(2017024016384L, 15028);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2017158234112L, 15029);
      FilterImageView.c localc = (FilterImageView.c)getItem(paramInt);
      Object localObject1;
      if ((paramView == null) || (!(paramView.getTag() instanceof a)))
      {
        paramViewGroup = View.inflate(FilterImageView.b(FilterImageView.this), a.h.geS, null);
        localObject1 = new a();
        ((a)localObject1).huP = ((TextView)paramViewGroup.findViewById(a.g.gdh));
        ((a)localObject1).xha = ((ImageView)paramViewGroup.findViewById(a.g.gdg));
        paramViewGroup.setTag(localObject1);
      }
      for (;;)
      {
        Object localObject2 = ((a)localObject1).huP;
        paramView = localc.xhf;
        String str = v.bPK();
        if (str.equals("zh_CN"))
        {
          paramView = paramView.wLR;
          label127:
          ((TextView)localObject2).setText(paramView);
        }
        try
        {
          paramView = FilterImageView.b(FilterImageView.this).getAssets().open("filter/" + localc.eQA);
          ((a)localObject1).xhb = d.decodeStream(paramView);
          paramView.close();
          ((a)localObject1).xha.setImageBitmap(((a)localObject1).xhb);
          paramViewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
          if (paramInt == this.mDH)
          {
            paramViewGroup.findViewById(a.g.gdg).setBackgroundResource(a.f.gcD);
            GMTrace.o(2017158234112L, 15029);
            return paramViewGroup;
            localObject2 = (a)paramView.getTag();
            localObject1 = localObject2;
            paramViewGroup = paramView;
            if (((a)localObject2).xhb == null) {
              continue;
            }
            w.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { ((a)localObject2).xhb.toString() });
            ((a)localObject2).xhb.recycle();
            localObject1 = localObject2;
            paramViewGroup = paramView;
            continue;
            if ((str.equals("zh_TW")) || (str.equals("zh_HK")))
            {
              paramView = paramView.xhd;
              break label127;
            }
            paramView = paramView.xhe;
          }
        }
        catch (IOException paramView)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FilterView", paramView, "", new Object[0]);
            continue;
            paramViewGroup.findViewById(a.g.gdg).setBackgroundResource(a.f.gcE);
          }
        }
      }
    }
    
    final class a
    {
      TextView huP;
      ImageView xha;
      Bitmap xhb;
      
      a()
      {
        GMTrace.i(2011118436352L, 14984);
        GMTrace.o(2011118436352L, 14984);
      }
    }
  }
  
  static final class b
  {
    String wLR;
    String xhd;
    String xhe;
    
    b(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(1910857793536L, 14237);
      this.wLR = paramString1;
      this.xhd = paramString2;
      this.xhe = paramString3;
      GMTrace.o(1910857793536L, 14237);
    }
  }
  
  static final class c
  {
    String eQA;
    FilterImageView.b xhf;
    String xhg;
    int xhh;
    int xhi;
    int xhj;
    
    c(FilterImageView.b paramb, String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3)
    {
      GMTrace.i(1941727870976L, 14467);
      this.xhf = paramb;
      this.xhg = paramString1;
      this.xhh = paramInt1;
      this.xhi = paramInt2;
      this.eQA = paramString2;
      this.xhj = paramInt3;
      GMTrace.o(1941727870976L, 14467);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\FilterImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */