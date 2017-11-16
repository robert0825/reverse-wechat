package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
  extends u
{
  public Context mContext;
  private ArrayList<b> nJH;
  private boolean nJI;
  public a nJJ;
  private List<String> nJk;
  
  public g(Context paramContext)
  {
    this(paramContext, (byte)0);
    GMTrace.i(6026241769472L, 44899);
    GMTrace.o(6026241769472L, 44899);
  }
  
  private g(Context paramContext, byte paramByte)
  {
    GMTrace.i(6026375987200L, 44900);
    this.nJI = false;
    this.nJJ = null;
    this.mContext = paramContext;
    this.nJk = null;
    an(this.nJk);
    GMTrace.o(6026375987200L, 44900);
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    GMTrace.i(6026912858112L, 44904);
    w.d("MicroMsg.MallProductImageAdapter", "destroy item");
    if (this.nJH != null) {
      paramViewGroup.removeView(((b)this.nJH.get(paramInt)).eKZ);
    }
    GMTrace.o(6026912858112L, 44904);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    GMTrace.i(6026778640384L, 44903);
    if (paramView == paramObject)
    {
      GMTrace.o(6026778640384L, 44903);
      return true;
    }
    GMTrace.o(6026778640384L, 44903);
    return false;
  }
  
  public final void an(List<String> paramList)
  {
    GMTrace.i(6026510204928L, 44901);
    if (paramList != null)
    {
      if (paramList.size() > 0) {
        this.nJk = paramList;
      }
      if (this.nJH == null) {
        this.nJH = new ArrayList();
      }
      for (;;)
      {
        paramList = this.nJk.iterator();
        while (paramList.hasNext())
        {
          b localb = new b((String)paramList.next());
          this.nJH.add(localb);
        }
        this.nJH.clear();
      }
    }
    GMTrace.o(6026510204928L, 44901);
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(6027181293568L, 44906);
    if (this.nJH != null)
    {
      w.d("MicroMsg.MallProductImageAdapter", "data valid");
      paramViewGroup.addView(((b)this.nJH.get(paramInt)).eKZ, 0);
      paramViewGroup = ((b)this.nJH.get(paramInt)).eKZ;
      GMTrace.o(6027181293568L, 44906);
      return paramViewGroup;
    }
    paramViewGroup = super.b(paramViewGroup, paramInt);
    GMTrace.o(6027181293568L, 44906);
    return paramViewGroup;
  }
  
  public final int getCount()
  {
    GMTrace.i(6026644422656L, 44902);
    if (this.nJk == null)
    {
      GMTrace.o(6026644422656L, 44902);
      return 0;
    }
    if (this.nJI)
    {
      GMTrace.o(6026644422656L, 44902);
      return Integer.MAX_VALUE;
    }
    int i = this.nJk.size();
    GMTrace.o(6026644422656L, 44902);
    return i;
  }
  
  public final int j(Object paramObject)
  {
    GMTrace.i(6027047075840L, 44905);
    GMTrace.o(6027047075840L, 44905);
    return -2;
  }
  
  public static abstract interface a
  {
    public abstract void aXu();
  }
  
  final class b
    implements j.a
  {
    public ImageView eKZ;
    public String url;
    
    public b(String paramString)
    {
      GMTrace.i(6025704898560L, 44895);
      this.eKZ = null;
      this.url = paramString;
      this.eKZ = ((ImageView)((LayoutInflater)g.this.mContext.getSystemService("layout_inflater")).inflate(a.g.sNU, null));
      paramString = j.a(new c(paramString));
      this.eKZ.setImageBitmap(paramString);
      this.eKZ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6019128229888L, 44846);
          w.i("MicroMsg.MallProductImageAdapter", "henryyr user: clicked the ImageView");
          if (g.this.nJJ != null) {
            g.this.nJJ.aXu();
          }
          GMTrace.o(6019128229888L, 44846);
        }
      });
      j.a(this);
      GMTrace.o(6025704898560L, 44895);
    }
    
    public final void k(String paramString, final Bitmap paramBitmap)
    {
      GMTrace.i(6025839116288L, 44896);
      StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(", bitmap = ");
      if (paramBitmap == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.MallProductImageAdapter", bool);
        if (this.url != null) {
          break;
        }
        GMTrace.o(6025839116288L, 44896);
        return;
      }
      if (paramString.equals(this.url)) {
        this.eKZ.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5998190264320L, 44690);
            g.b.this.eKZ.setImageBitmap(paramBitmap);
            GMTrace.o(5998190264320L, 44690);
          }
        });
      }
      GMTrace.o(6025839116288L, 44896);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */