package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.h;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c
  extends b
{
  private HashMap<String, Bitmap> pVB;
  boolean pVE;
  private int qnq;
  private boolean qnr;
  private boolean qns;
  a qnt;
  
  public c(Context paramContext, List<?> paramList, int paramInt, boolean paramBoolean, a parama)
  {
    super(paramContext, 4);
    GMTrace.i(15970030583808L, 118986);
    this.pVB = new HashMap();
    super.bI(bJ(paramList));
    this.qnq = 9;
    this.qnr = paramBoolean;
    this.qnt = parama;
    bpY();
    bpZ();
    GMTrace.o(15970030583808L, 118986);
  }
  
  private List<d> bJ(List<?> paramList)
  {
    GMTrace.i(15970164801536L, 118987);
    ArrayList localArrayList = new ArrayList(paramList.size());
    int i = 0;
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = paramList.next();
      d locald = new d();
      locald.data = localObject;
      locald.id = i;
      localArrayList.add(locald);
      i += 1;
    }
    GMTrace.o(15970164801536L, 118987);
    return localArrayList;
  }
  
  private void bpY()
  {
    GMTrace.i(15970299019264L, 118988);
    int i = 0;
    while (i < this.qnp)
    {
      d locald = new d();
      locald.data = "";
      locald.id = getCount();
      locald.id = getCount();
      add(i, locald);
      i += 1;
    }
    GMTrace.o(15970299019264L, 118988);
  }
  
  public final void bI(List<?> paramList)
  {
    GMTrace.i(15970701672448L, 118991);
    super.bI(bJ(paramList));
    bpY();
    bpZ();
    GMTrace.o(15970701672448L, 118991);
  }
  
  public final void bpZ()
  {
    GMTrace.i(15970433236992L, 118989);
    w.v("DynamicGridAdapter", "showAddImg %s, getCount %d, getHeaderCount %d, maxShowCount %d， showing %s", new Object[] { Boolean.valueOf(this.qnr), Integer.valueOf(getCount()), Integer.valueOf(this.qnp), Integer.valueOf(this.qnq), Boolean.valueOf(this.qns) });
    if ((this.qnr) && (bqa() < this.qnq))
    {
      if (!this.qns)
      {
        this.qns = true;
        add("");
        GMTrace.o(15970433236992L, 118989);
      }
    }
    else {
      this.qns = false;
    }
    GMTrace.o(15970433236992L, 118989);
  }
  
  public final int bqa()
  {
    GMTrace.i(15970835890176L, 118992);
    int j = getCount();
    int k = this.qnp;
    if (this.qns) {}
    for (int i = 1;; i = 0)
    {
      GMTrace.o(15970835890176L, 118992);
      return j - k - i;
    }
  }
  
  public final void clear()
  {
    GMTrace.i(15970567454720L, 118990);
    super.clear();
    this.qns = false;
    GMTrace.o(15970567454720L, 118990);
  }
  
  public final void di(int paramInt1, int paramInt2)
  {
    GMTrace.i(15971372761088L, 118996);
    super.di(paramInt1, paramInt2);
    if (this.qnt != null) {
      this.qnt.de(paramInt1 - this.qnp, paramInt2 - this.qnp);
    }
    GMTrace.o(15971372761088L, 118996);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(16275912785920L, 121265);
    if (TextUtils.isEmpty(getItem(paramInt).toString()))
    {
      GMTrace.o(16275912785920L, 121265);
      return 1;
    }
    GMTrace.o(16275912785920L, 121265);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(15970970107904L, 118993);
    String str;
    ImageView localImageView;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(i.g.pgd, paramViewGroup, false);
      paramViewGroup = new b(paramView);
      paramView.setTag(i.f.paY, paramViewGroup);
      str = getItem(paramInt).toString();
      localImageView = paramViewGroup.eId;
      if (!TextUtils.isEmpty(str)) {
        break label196;
      }
      localImageView.setBackgroundColor(0);
      localImageView.setBackgroundDrawable(null);
      localImageView.setImageDrawable(null);
      localImageView.setBackgroundResource(i.e.oYm);
      localImageView.setContentDescription(paramViewGroup.eId.getContext().getString(i.j.piB));
      if (paramInt <= 0) {
        break label169;
      }
      paramViewGroup.view.setTag(Integer.valueOf(-1));
      label129:
      if (paramInt >= this.qnp) {
        break label312;
      }
      paramViewGroup.eId.setVisibility(4);
    }
    for (;;)
    {
      GMTrace.o(15970970107904L, 118993);
      return paramView;
      paramViewGroup = (b)paramView.getTag(i.f.paY);
      break;
      label169:
      if (paramInt >= paramViewGroup.qnu.qnp) {
        break label129;
      }
      paramViewGroup.view.setTag(Integer.valueOf(Integer.MAX_VALUE));
      break label129;
      label196:
      paramViewGroup.view.setTag(Integer.valueOf(paramInt - paramViewGroup.qnu.qnp));
      localImageView.setBackgroundDrawable(null);
      localImageView.setTag(str);
      localImageView.setContentDescription(paramViewGroup.eId.getContext().getString(i.j.pjy));
      Bitmap localBitmap = (Bitmap)paramViewGroup.qnu.pVB.get(str);
      if (!i.m(localBitmap))
      {
        new c(paramViewGroup.qnu, localImageView, str).m(new String[] { "" });
        break label129;
      }
      localImageView.setImageBitmap(localBitmap);
      break label129;
      label312:
      paramViewGroup.eId.setVisibility(0);
      paramView.setVisibility(0);
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(16276047003648L, 121266);
    GMTrace.o(16276047003648L, 121266);
    return 2;
  }
  
  public final boolean vC(int paramInt)
  {
    GMTrace.i(15971104325632L, 118994);
    if (paramInt < this.qnp)
    {
      GMTrace.o(15971104325632L, 118994);
      return false;
    }
    if (this.qns)
    {
      if (paramInt != getCount() - 1)
      {
        GMTrace.o(15971104325632L, 118994);
        return true;
      }
      GMTrace.o(15971104325632L, 118994);
      return false;
    }
    boolean bool = super.vC(paramInt);
    GMTrace.o(15971104325632L, 118994);
    return bool;
  }
  
  public final boolean vD(int paramInt)
  {
    GMTrace.i(15971238543360L, 118995);
    if (paramInt < this.qnp)
    {
      GMTrace.o(15971238543360L, 118995);
      return false;
    }
    if (this.qns)
    {
      if (paramInt != getCount() - 1)
      {
        GMTrace.o(15971238543360L, 118995);
        return true;
      }
      GMTrace.o(15971238543360L, 118995);
      return false;
    }
    boolean bool = super.vD(paramInt);
    GMTrace.o(15971238543360L, 118995);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void de(int paramInt1, int paramInt2);
    
    public abstract void removeItem(int paramInt);
  }
  
  private final class b
  {
    public ImageView eId;
    View view;
    
    public b(View paramView)
    {
      GMTrace.i(15992847597568L, 119156);
      this.view = paramView;
      this.eId = ((ImageView)paramView.findViewById(i.f.pbc));
      GMTrace.o(15992847597568L, 119156);
    }
  }
  
  final class c
    extends h<String, Integer, Boolean>
  {
    private ImageView eKZ;
    private Bitmap gsp;
    private String path;
    
    public c(ImageView paramImageView, String paramString)
    {
      GMTrace.i(15992310726656L, 119152);
      this.eKZ = paramImageView;
      this.path = paramString;
      GMTrace.o(15992310726656L, 119152);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae biu()
    {
      GMTrace.i(15992444944384L, 119153);
      com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.biO();
      GMTrace.o(15992444944384L, 119153);
      return localae;
    }
  }
  
  private final class d
  {
    public Object data;
    public int id;
    
    public d()
    {
      GMTrace.i(15991773855744L, 119148);
      GMTrace.o(15991773855744L, 119148);
    }
    
    public final int hashCode()
    {
      GMTrace.i(15992042291200L, 119150);
      int i = this.id;
      GMTrace.o(15992042291200L, 119150);
      return i;
    }
    
    public final String toString()
    {
      GMTrace.i(15991908073472L, 119149);
      String str = this.data.toString();
      GMTrace.o(15991908073472L, 119149);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\previewimageview\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */