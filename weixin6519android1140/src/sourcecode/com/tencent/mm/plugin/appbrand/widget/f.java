package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.plugin.appbrand.o.f;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  extends FrameLayout
{
  public LinearLayout iJp;
  public ImageView iJq;
  public String iJr;
  public int iJs;
  public int iJt;
  public LinkedList<a> iJu;
  private int iJv;
  public b iJw;
  private int mHeight;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10138136084480L, 75535);
    this.mHeight = 0;
    this.iJv = 0;
    this.iJu = new LinkedList();
    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    this.iJq = new ImageView(paramContext);
    this.iJq.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    addView(this.iJq);
    this.iJp = new LinearLayout(paramContext);
    this.iJp.setOrientation(0);
    this.iJp.setGravity(16);
    this.iJp.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    addView(this.iJp);
    GMTrace.o(10138136084480L, 75535);
  }
  
  public static Bitmap sM(String paramString)
  {
    GMTrace.i(10138270302208L, 75536);
    paramString = Base64.decode(paramString, 0);
    paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
    GMTrace.o(10138270302208L, 75536);
    return paramString;
  }
  
  public final void a(View paramView, a parama, boolean paramBoolean)
  {
    GMTrace.i(10138538737664L, 75538);
    ImageView localImageView = (ImageView)paramView.findViewById(o.f.icon);
    TextView localTextView = (TextView)paramView.findViewById(o.f.text);
    View localView1 = paramView.findViewById(o.f.bHn);
    View localView2 = paramView.findViewById(o.f.hBQ);
    if ("top".equals(this.iJr))
    {
      paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 40), 1.0F));
      localImageView.setVisibility(8);
      localTextView.setTextSize(1, 14.0F);
      localView2.setVisibility(0);
      if ((!paramBoolean) || (parama.iJy == null)) {
        break label421;
      }
      localImageView.setImageBitmap(parama.iJy);
      label125:
      localTextView.setText(parama.iJz);
      if (!paramBoolean) {
        break label433;
      }
      localTextView.setTextColor(this.iJt);
    }
    for (;;)
    {
      if (!paramBoolean) {
        break label445;
      }
      localView1.setBackgroundColor(this.iJt);
      localView1.setVisibility(0);
      GMTrace.o(10138538737664L, 75538);
      return;
      if ((parama.ua != null) && (parama.iJz != null))
      {
        paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 54), 1.0F));
        localImageView.setVisibility(0);
        localImageView.getLayoutParams().width = a.fromDPToPix(getContext(), 32);
        localImageView.getLayoutParams().height = a.fromDPToPix(getContext(), 28);
        localTextView.setVisibility(0);
        localTextView.setTextSize(1, 12.0F);
      }
      for (;;)
      {
        localView2.setVisibility(8);
        break;
        if ((parama.ua != null) && (parama.iJz == null))
        {
          paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 48), 1.0F));
          localImageView.setVisibility(0);
          localImageView.getLayoutParams().width = a.fromDPToPix(getContext(), 36);
          localImageView.getLayoutParams().height = a.fromDPToPix(getContext(), 36);
          localTextView.setVisibility(8);
        }
        else if ((parama.ua == null) && (parama.iJz != null))
        {
          paramView.setLayoutParams(new LinearLayout.LayoutParams(0, a.fromDPToPix(getContext(), 49), 1.0F));
          localImageView.setVisibility(8);
          localTextView.setVisibility(0);
          localTextView.setTextSize(1, 16.0F);
        }
      }
      label421:
      localImageView.setImageBitmap(parama.ua);
      break label125;
      label433:
      localTextView.setTextColor(this.iJs);
    }
    label445:
    localView1.setVisibility(4);
    GMTrace.o(10138538737664L, 75538);
  }
  
  public final void jV(int paramInt)
  {
    GMTrace.i(10138404519936L, 75537);
    a(this.iJp.getChildAt(this.iJv), (a)this.iJu.get(this.iJv), false);
    if ((paramInt > 0) && (paramInt < this.iJu.size())) {}
    for (this.iJv = paramInt;; this.iJv = 0)
    {
      a(this.iJp.getChildAt(this.iJv), (a)this.iJu.get(this.iJv), true);
      GMTrace.o(10138404519936L, 75537);
      return;
    }
  }
  
  public final int sN(String paramString)
  {
    GMTrace.i(18296694898688L, 136321);
    LinkedList localLinkedList = this.iJu;
    String str = h.sv(paramString);
    Iterator localIterator = this.iJu.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      paramString = (a)localIterator.next();
    } while (!h.sv(paramString.mUrl).equals(str));
    for (;;)
    {
      int i = localLinkedList.indexOf(paramString);
      GMTrace.o(18296694898688L, 136321);
      return i;
      paramString = null;
    }
  }
  
  private static final class a
  {
    public Bitmap iJy;
    public String iJz;
    public String mUrl;
    public Bitmap ua;
    
    public a()
    {
      GMTrace.i(10045794287616L, 74847);
      GMTrace.o(10045794287616L, 74847);
    }
  }
  
  public static abstract interface b
  {
    public abstract void rH(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */