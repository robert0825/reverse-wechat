package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bj.d;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.scanner.a.i;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.plugin.scanner.util.n.a.a;
import com.tencent.mm.plugin.scanner.util.n.a.a.a;
import com.tencent.mm.plugin.scanner.util.n.a.a.b;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductFurtherInfoUI
  extends MMPreference
{
  protected f iAA;
  private MMPageControlView ovY;
  private n.a.a ovZ;
  private String owa;
  private ViewPager wV;
  
  public ProductFurtherInfoUI()
  {
    GMTrace.i(6113214857216L, 45547);
    GMTrace.o(6113214857216L, 45547);
  }
  
  protected final void MP()
  {
    int j = 0;
    GMTrace.i(6113483292672L, 45549);
    sq(getIntent().getStringExtra("key_title"));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6142608539648L, 45766);
        ProductFurtherInfoUI.this.finish();
        GMTrace.o(6142608539648L, 45766);
        return false;
      }
    });
    a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6097242947584L, 45428);
        paramAnonymousMenuItem = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousMenuItem.add(ProductFurtherInfoUI.this.getString(R.l.dVF));
        localLinkedList.add(Integer.valueOf(0));
        h.a(ProductFurtherInfoUI.this.vKB.vKW, "", paramAnonymousMenuItem, localLinkedList, "", false, new h.d()
        {
          public final void bT(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(6145024458752L, 45784);
            switch (paramAnonymous2Int2)
            {
            }
            for (;;)
            {
              GMTrace.o(6145024458752L, 45784);
              return;
              if (!bg.nm(ProductFurtherInfoUI.a(ProductFurtherInfoUI.this)))
              {
                Intent localIntent = new Intent();
                localIntent.putExtra("rawUrl", ProductFurtherInfoUI.a(ProductFurtherInfoUI.this));
                d.b(ProductFurtherInfoUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
              }
            }
          }
        });
        GMTrace.o(6097242947584L, 45428);
        return true;
      }
    });
    this.iAA = this.wky;
    Object localObject1 = new ArrayList();
    Object localObject2 = this.ovZ.oBu.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((List)localObject1).add(((n.a.a.a)((Iterator)localObject2).next()).gVf);
    }
    this.wV = ((ViewPager)findViewById(R.h.bSU));
    this.ovY = ((MMPageControlView)findViewById(R.h.bHn));
    this.ovY.wdF = R.i.cDn;
    this.ovY.setVisibility(0);
    this.wV.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6061541031936L, 45162);
        if ((paramAnonymousView != null) && (paramAnonymousView.getParent() != null)) {
          paramAnonymousView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        GMTrace.o(6061541031936L, 45162);
        return false;
      }
    });
    this.wV.yr = new ViewPager.e()
    {
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(6135360782336L, 45712);
        if (ProductFurtherInfoUI.b(ProductFurtherInfoUI.this).getParent() != null) {
          ProductFurtherInfoUI.b(ProductFurtherInfoUI.this).getParent().requestDisallowInterceptTouchEvent(true);
        }
        ProductFurtherInfoUI.c(ProductFurtherInfoUI.this).uN(paramAnonymousInt);
        GMTrace.o(6135360782336L, 45712);
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(6135495000064L, 45713);
        GMTrace.o(6135495000064L, 45713);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        GMTrace.i(6135226564608L, 45711);
        GMTrace.o(6135226564608L, 45711);
      }
    };
    localObject2 = new a(this);
    this.wV.a((u)localObject2);
    int i = j;
    if (((List)localObject1).size() > 0)
    {
      ((a)localObject2).owd = ((List)localObject1);
      ((a)localObject2).owb.ovY.en(((List)localObject1).size(), 0);
      ((a)localObject2).notifyDataSetChanged();
      this.wV.setVisibility(0);
      i = j;
    }
    while (i < this.ovZ.oBv.size())
    {
      localObject1 = (n.a.a.b)this.ovZ.oBv.get(i);
      localObject2 = new Preference(this);
      ((Preference)localObject2).setKey(String.valueOf(i));
      ((Preference)localObject2).setLayoutResource(R.i.cCB);
      ((Preference)localObject2).setTitle(((n.a.a.b)localObject1).title);
      ((Preference)localObject2).setSummary(((n.a.a.b)localObject1).desc);
      this.iAA.a((Preference)localObject2);
      i += 1;
    }
    this.iAA.notifyDataSetChanged();
    GMTrace.o(6113483292672L, 45549);
  }
  
  public final int QI()
  {
    GMTrace.i(6113617510400L, 45550);
    int i = R.o.cDC;
    GMTrace.o(6113617510400L, 45550);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(6114020163584L, 45553);
    GMTrace.o(6114020163584L, 45553);
    return false;
  }
  
  public final int ait()
  {
    GMTrace.i(6113885945856L, 45552);
    int i = R.i.cDD;
    GMTrace.o(6113885945856L, 45552);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6113751728128L, 45551);
    int i = R.i.cDC;
    GMTrace.o(6113751728128L, 45551);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6113349074944L, 45548);
    super.onCreate(paramBundle);
    paramBundle = i.bH(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
    if ((paramBundle == null) || (paramBundle.oBt == null))
    {
      w.e("MicroMsg.ProductFurtherInfoUI", "initView(), product or product field detail null -> finish");
      finish();
      GMTrace.o(6113349074944L, 45548);
      return;
    }
    this.ovZ = paramBundle.oBt;
    this.owa = paramBundle.field_feedbackurl;
    MP();
    GMTrace.o(6113349074944L, 45548);
  }
  
  final class a
    extends u
    implements j.a
  {
    private Context mContext;
    List<String> owd;
    private Map<String, ImageView> owe;
    private int owf;
    
    public a(Context paramContext)
    {
      GMTrace.i(6104088051712L, 45479);
      this.owd = new ArrayList();
      this.owe = new HashMap();
      this.mContext = paramContext;
      j.a(this);
      this.owf = this.mContext.getResources().getColor(R.e.aOb);
      GMTrace.o(6104088051712L, 45479);
    }
    
    private ImageView FQ(String paramString)
    {
      GMTrace.i(6104222269440L, 45480);
      if (this.owe.containsKey(paramString))
      {
        paramString = (ImageView)this.owe.get(paramString);
        GMTrace.o(6104222269440L, 45480);
        return paramString;
      }
      ImageView localImageView = new ImageView(this.mContext);
      localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
      localImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.owe.put(paramString, localImageView);
      GMTrace.o(6104222269440L, 45480);
      return localImageView;
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(6104490704896L, 45482);
      paramViewGroup.removeView((ImageView)paramObject);
      paramViewGroup = (String)this.owd.get(paramInt);
      if (this.owe.containsKey(paramViewGroup)) {
        this.owe.remove(paramViewGroup);
      }
      GMTrace.o(6104490704896L, 45482);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(6104759140352L, 45484);
      if (paramView == paramObject)
      {
        GMTrace.o(6104759140352L, 45484);
        return true;
      }
      GMTrace.o(6104759140352L, 45484);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(6104356487168L, 45481);
      Object localObject = (String)this.owd.get(paramInt);
      ImageView localImageView = FQ((String)localObject);
      localObject = j.a(new o((String)localObject));
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      {
        localImageView.setImageBitmap((Bitmap)localObject);
        localImageView.setBackgroundColor(0);
      }
      try
      {
        for (;;)
        {
          paramViewGroup.addView(localImageView);
          GMTrace.o(6104356487168L, 45481);
          return localImageView;
          localImageView.setImageBitmap(null);
          localImageView.setBackgroundColor(this.owf);
        }
      }
      catch (Exception paramViewGroup)
      {
        for (;;)
        {
          w.e("MicroMsg.ProductFurtherInfoUI", "Add view failed: " + paramViewGroup.getMessage());
        }
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(6104624922624L, 45483);
      int i = this.owd.size();
      GMTrace.o(6104624922624L, 45483);
      return i;
    }
    
    public final void k(final String paramString, final Bitmap paramBitmap)
    {
      GMTrace.i(6104893358080L, 45485);
      if ((paramBitmap != null) && (!paramBitmap.isRecycled()) && (!bg.nm(paramString)))
      {
        paramString = FQ(paramString);
        if (paramString != null) {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6130663161856L, 45677);
              paramString.setImageBitmap(paramBitmap);
              paramString.setBackgroundColor(0);
              GMTrace.o(6130663161856L, 45677);
            }
          });
        }
      }
      GMTrace.o(6104893358080L, 45485);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\ProductFurtherInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */