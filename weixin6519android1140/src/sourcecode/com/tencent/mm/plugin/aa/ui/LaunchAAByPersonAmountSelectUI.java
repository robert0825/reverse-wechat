package com.tencent.mm.plugin.aa.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.aa.a.c.c;
import com.tencent.mm.plugin.aa.a.c.c.a;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LaunchAAByPersonAmountSelectUI
  extends BaseAAPresenterActivity
{
  private String eCK;
  private ae ghS;
  private c hrl;
  private ListView hrm;
  private TextView hrn;
  private TextView hro;
  private View hrp;
  private TextView hrq;
  private boolean hrr;
  private Map<String, String> hrs;
  private a hrt;
  private double hru;
  private long hrv;
  private int hrw;
  private boolean hrx;
  private boolean hry;
  private Runnable hrz;
  
  public LaunchAAByPersonAmountSelectUI()
  {
    GMTrace.i(5622783279104L, 41893);
    this.hrl = ((c)p(c.class));
    this.hrr = false;
    this.hrs = new HashMap();
    this.hrt = null;
    this.hrv = -1L;
    this.hrw = -1;
    this.hry = false;
    this.ghS = new ae(Looper.getMainLooper());
    this.hrz = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5632446955520L, 41965);
        LaunchAAByPersonAmountSelectUI.a(LaunchAAByPersonAmountSelectUI.this);
        LaunchAAByPersonAmountSelectUI.b(LaunchAAByPersonAmountSelectUI.this);
        GMTrace.o(5632446955520L, 41965);
      }
    };
    GMTrace.o(5622783279104L, 41893);
  }
  
  private void Qh()
  {
    GMTrace.i(5623185932288L, 41896);
    try
    {
      this.hru = 0.0D;
      this.hrx = false;
      if (this.hrs == null) {
        break label273;
      }
      Iterator localIterator = this.hrs.values().iterator();
      while (localIterator.hasNext())
      {
        double d = bg.getDouble((String)localIterator.next(), 0.0D);
        this.hru += d;
        if ((this.hrv > 0L) && (d * 100.0D > this.hrv)) {
          this.hrx = true;
        }
      }
      if (this.hrt == null) {
        break label273;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "updateTotalAmount error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(5623185932288L, 41896);
      return;
    }
    Object localObject2 = this.hrt;
    Object localObject1 = this.hrs;
    Object localObject3 = ((a)localObject2).dataList.iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((b)((Iterator)localObject3).next()).hrH = "";
    }
    if ((localObject1 != null) && (((Map)localObject1).size() > 0))
    {
      localObject2 = ((a)localObject2).dataList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (b)((Iterator)localObject2).next();
        if (((Map)localObject1).containsKey(((b)localObject3).username)) {
          ((b)localObject3).hrH = ((String)((Map)localObject1).get(((b)localObject3).username));
        }
      }
    }
    label273:
    this.hro.setText(getString(a.i.sTK, new Object[] { Double.valueOf(this.hru) }));
    if ((this.hrs != null) && (this.hrs.size() > 0)) {
      aH(233, getString(a.i.sRi, new Object[] { Integer.valueOf(this.hrs.size()) }));
    }
    while (this.hrx)
    {
      g.ork.i(13722, new Object[] { Integer.valueOf(7) });
      Y(233, false);
      localObject1 = getString(a.i.sTU, new Object[] { Float.valueOf((float)this.hrv / 100.0F) });
      if (!bg.nm((String)localObject1))
      {
        this.hrq.setText((CharSequence)localObject1);
        if (!this.hrq.isShown())
        {
          this.hrq.startAnimation(AnimationUtils.loadAnimation(this, a.a.slJ));
          this.hrq.setVisibility(0);
        }
      }
      GMTrace.o(5623185932288L, 41896);
      return;
      aH(233, getString(a.i.cTM));
    }
    Y(233, true);
    if (this.hrq.isShown())
    {
      this.hrq.setText("");
      this.hrq.startAnimation(AnimationUtils.loadAnimation(this, a.a.slK));
      this.hrq.setVisibility(8);
    }
    GMTrace.o(5623185932288L, 41896);
  }
  
  private void Qi()
  {
    GMTrace.i(5623320150016L, 41897);
    if (this.hru > 0.0D)
    {
      this.hrr = true;
      this.hrn.setTextColor(getResources().getColor(a.c.aMX));
      GMTrace.o(5623320150016L, 41897);
      return;
    }
    this.hrr = false;
    this.hrn.setTextColor(getResources().getColor(a.c.smc));
    GMTrace.o(5623320150016L, 41897);
  }
  
  protected final int Qf()
  {
    GMTrace.i(5623051714560L, 41895);
    GMTrace.o(5623051714560L, 41895);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5623454367744L, 41898);
    int i = a.g.sMB;
    GMTrace.o(5623454367744L, 41898);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(5622917496832L, 41894);
    super.onCreate(paramBundle);
    oM(a.i.sTL);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5646405599232L, 42069);
        if ((LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this) != null) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).size() > 0)) {
          com.tencent.mm.ui.base.h.a(LaunchAAByPersonAmountSelectUI.this, LaunchAAByPersonAmountSelectUI.this.getString(a.i.sRA), null, LaunchAAByPersonAmountSelectUI.this.getString(a.i.sRD), LaunchAAByPersonAmountSelectUI.this.getString(a.i.sRC), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5626407157760L, 41920);
              LaunchAAByPersonAmountSelectUI.d(LaunchAAByPersonAmountSelectUI.this);
              GMTrace.o(5626407157760L, 41920);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5621038448640L, 41880);
              LaunchAAByPersonAmountSelectUI.this.finish();
              GMTrace.o(5621038448640L, 41880);
            }
          });
        }
        for (;;)
        {
          GMTrace.o(5646405599232L, 42069);
          return true;
          LaunchAAByPersonAmountSelectUI.this.finish();
        }
      }
    });
    a(233, getString(a.i.cTM), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5651640090624L, 42108);
        if ((LaunchAAByPersonAmountSelectUI.e(LaunchAAByPersonAmountSelectUI.this) > 0) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this) != null) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).size() > LaunchAAByPersonAmountSelectUI.e(LaunchAAByPersonAmountSelectUI.this)))
        {
          com.tencent.mm.ui.base.h.b(LaunchAAByPersonAmountSelectUI.this.vKB.vKW, LaunchAAByPersonAmountSelectUI.this.getString(a.i.sTM, new Object[] { Integer.valueOf(LaunchAAByPersonAmountSelectUI.e(LaunchAAByPersonAmountSelectUI.this)) }), "", true);
          g.ork.i(13722, new Object[] { Integer.valueOf(8) });
          GMTrace.o(5651640090624L, 42108);
          return true;
        }
        LaunchAAByPersonAmountSelectUI.d(LaunchAAByPersonAmountSelectUI.this);
        g.ork.i(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(4) });
        GMTrace.o(5651640090624L, 42108);
        return true;
      }
    }, p.b.vLG);
    this.hrm = ((ListView)findViewById(a.f.spP));
    this.hrn = ((TextView)findViewById(a.f.sth));
    this.hro = ((TextView)findViewById(a.f.spQ));
    this.hro.setText(getString(a.i.sTK, new Object[] { Float.valueOf(0.0F) }));
    this.hrp = findViewById(a.f.sHp);
    this.hrq = ((TextView)findViewById(a.f.spK));
    this.hqY = this.hrm;
    this.hrp.setVisibility(8);
    this.hrn.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5616877699072L, 41849);
        if (!LaunchAAByPersonAmountSelectUI.k(LaunchAAByPersonAmountSelectUI.this))
        {
          GMTrace.o(5616877699072L, 41849);
          return true;
        }
        if ((paramAnonymousMotionEvent.getAction() == 0) || (paramAnonymousMotionEvent.getAction() == 2)) {
          LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(a.c.aMY));
        }
        for (;;)
        {
          GMTrace.o(5616877699072L, 41849);
          return false;
          if (LaunchAAByPersonAmountSelectUI.k(LaunchAAByPersonAmountSelectUI.this)) {
            LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(a.c.aMX));
          } else {
            LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(a.c.smc));
          }
        }
      }
    });
    this.hrn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5632715390976L, 41967);
        if ((LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this) != null) && (LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).size() > 0)) {}
        try
        {
          paramAnonymousView = new i.a(LaunchAAByPersonAmountSelectUI.this);
          paramAnonymousView.BO(a.i.sRc);
          paramAnonymousView.BQ(a.i.cTM).a(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5635802398720L, 41990);
              LaunchAAByPersonAmountSelectUI.m(LaunchAAByPersonAmountSelectUI.this);
              GMTrace.o(5635802398720L, 41990);
            }
          });
          paramAnonymousView.BR(a.i.cSk).b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5605200756736L, 41762);
              g.ork.i(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(10) });
              GMTrace.o(5605200756736L, 41762);
            }
          });
          paramAnonymousView.aax().show();
          g.ork.i(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(8) });
          GMTrace.o(5632715390976L, 41967);
          return;
        }
        catch (Exception paramAnonymousView)
        {
          for (;;)
          {
            w.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "clear amount error");
          }
        }
      }
    });
    this.hrr = true;
    this.hrm.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5644258115584L, 42053);
        GMTrace.o(5644258115584L, 42053);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5644123897856L, 42052);
        if (paramAnonymousInt == 1) {
          LaunchAAByPersonAmountSelectUI.this.Qg();
        }
        GMTrace.o(5644123897856L, 42052);
      }
    });
    this.eCK = getIntent().getStringExtra("chatroom");
    this.hrv = getIntent().getLongExtra("maxPerAmount", -1L);
    this.hrw = getIntent().getIntExtra("maxUserNumber", -1);
    Object localObject = getIntent().getStringArrayListExtra("oldAmountData");
    w.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate, chatroom: %s, maxPerAmount: %s, oldDataList: %s", new Object[] { this.eCK, Long.valueOf(this.hrv), localObject });
    this.hrs = new HashMap();
    paramBundle = new HashMap();
    if (localObject != null) {
      try
      {
        if (((ArrayList)localObject).size() > 0)
        {
          localObject = ((ArrayList)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            String[] arrayOfString = ((String)((Iterator)localObject).next()).split(",");
            if ((arrayOfString != null) && (arrayOfString.length == 2))
            {
              double d = bg.getDouble(arrayOfString[1], 0.0D);
              paramBundle.put(arrayOfString[0], Double.valueOf(d));
              this.hrs.put(arrayOfString[0], getString(a.i.sRb, new Object[] { Double.valueOf(d) }));
            }
          }
        }
        this.hrl.D(c.a.class);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate parse old data error: %s", new Object[] { localException.getMessage() });
      }
    }
    this.hrl.a(c.a.class, new com.tencent.mm.vending.app.a.b() {});
    GMTrace.o(5622917496832L, 41894);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5623588585472L, 41899);
    super.onDestroy();
    if (this.hrs != null) {
      this.hrs.clear();
    }
    GMTrace.o(5623588585472L, 41899);
  }
  
  private final class a
    extends BaseAdapter
  {
    List<LaunchAAByPersonAmountSelectUI.b> dataList;
    
    public a(Map<String, Double> paramMap)
    {
      GMTrace.i(5633923350528L, 41976);
      this.dataList = null;
      this.dataList = new ArrayList();
      paramMap = paramMap.iterator();
      if (paramMap.hasNext())
      {
        String str = (String)paramMap.next();
        LaunchAAByPersonAmountSelectUI.b localb = new LaunchAAByPersonAmountSelectUI.b(LaunchAAByPersonAmountSelectUI.this);
        localb.username = str;
        Object localObject;
        if ((localObject != null) && (((Map)localObject).containsKey(str))) {}
        for (localb.hrH = LaunchAAByPersonAmountSelectUI.this.getString(a.i.sRb, new Object[] { ((Map)localObject).get(str) });; localb.hrH = "")
        {
          this.dataList.add(localb);
          break;
        }
      }
      GMTrace.o(5633923350528L, 41976);
    }
    
    private LaunchAAByPersonAmountSelectUI.b hH(int paramInt)
    {
      GMTrace.i(5634191785984L, 41978);
      LaunchAAByPersonAmountSelectUI.b localb = (LaunchAAByPersonAmountSelectUI.b)this.dataList.get(paramInt);
      GMTrace.o(5634191785984L, 41978);
      return localb;
    }
    
    public final int getCount()
    {
      GMTrace.i(5634057568256L, 41977);
      int i = this.dataList.size();
      GMTrace.o(5634057568256L, 41977);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5634326003712L, 41979);
      long l = paramInt;
      GMTrace.o(5634326003712L, 41979);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5634460221440L, 41980);
      LaunchAAByPersonAmountSelectUI.b localb = hH(paramInt);
      Object localObject = paramView;
      if (localb != null)
      {
        localObject = paramView;
        if (!bg.nm(localb.username))
        {
          View localView = paramView;
          if (paramView == null)
          {
            localView = v.fb(LaunchAAByPersonAmountSelectUI.this).inflate(a.g.sMA, paramViewGroup, false);
            paramView = new a();
            paramView.hqg = ((ImageView)localView.findViewById(a.f.bfk));
            paramView.hrh = ((TextView)localView.findViewById(a.f.cjM));
            paramView.hri = ((WalletFormView)localView.findViewById(a.f.sCy));
            paramView.hrG = new LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this, localb.username);
            paramView.hri.a(paramView.hrG);
            paramView.hqg.setOnTouchListener(new View.OnTouchListener()
            {
              public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
              {
                GMTrace.i(5643855462400L, 42050);
                paramView.hri.requestFocus();
                GMTrace.o(5643855462400L, 42050);
                return false;
              }
            });
            paramView.hrh.setOnTouchListener(new View.OnTouchListener()
            {
              public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
              {
                GMTrace.i(5639560495104L, 42018);
                paramView.hri.requestFocus();
                GMTrace.o(5639560495104L, 42018);
                return false;
              }
            });
            localView.setTag(paramView);
            LaunchAAByPersonAmountSelectUI.this.a(paramView.hri, 2, false, true);
          }
          paramView = (a)localView.getTag();
          if (!bg.nm(localb.username))
          {
            paramView.hrG.username = localb.username;
            com.tencent.mm.pluginsdk.ui.a.b.a(paramView.hqg, localb.username);
            paramView.hrh.setText(com.tencent.mm.pluginsdk.ui.d.h.b(LaunchAAByPersonAmountSelectUI.this.vKB.vKW, ((a)com.tencent.mm.kernel.h.h(a.class)).F(localb.username, LaunchAAByPersonAmountSelectUI.n(LaunchAAByPersonAmountSelectUI.this)), paramView.hrh.getTextSize()));
          }
          localObject = localView;
          if (localb.hrH != null)
          {
            localObject = localView;
            if (paramView.hri.getText() != null)
            {
              localObject = localView;
              if (!localb.hrH.equals(paramView.hri.getText().toLowerCase()))
              {
                paramViewGroup = paramView.hri;
                localObject = paramView.hrG;
                if (paramViewGroup.xFt != null) {
                  paramViewGroup.xFt.removeTextChangedListener((TextWatcher)localObject);
                }
                paramView.hri.setText(localb.hrH);
                paramView.hri.a(paramView.hrG);
                localObject = localView;
              }
            }
          }
        }
      }
      GMTrace.o(5634460221440L, 41980);
      return (View)localObject;
    }
    
    private final class a
    {
      ImageView hqg;
      LaunchAAByPersonAmountSelectUI.c hrG;
      TextView hrh;
      WalletFormView hri;
      
      public a()
      {
        GMTrace.i(5650969001984L, 42103);
        GMTrace.o(5650969001984L, 42103);
      }
    }
  }
  
  private final class b
  {
    String hrH;
    String username;
    
    public b()
    {
      GMTrace.i(5609361506304L, 41793);
      this.username = null;
      this.hrH = null;
      GMTrace.o(5609361506304L, 41793);
    }
  }
  
  protected final class c
    implements TextWatcher
  {
    String username;
    
    public c(String paramString)
    {
      GMTrace.i(5633118044160L, 41970);
      this.username = paramString;
      GMTrace.o(5633118044160L, 41970);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(5633520697344L, 41973);
      try
      {
        if (paramEditable.toString().startsWith(".")) {
          paramEditable.insert(0, "0");
        }
        String str = paramEditable.toString();
        int i = str.indexOf(".");
        int j = str.length();
        if ((i >= 0) && (j - i > 2)) {
          paramEditable.delete(i + 3, j);
        }
        int k = str.lastIndexOf(".");
        if ((k != i) && (k > 0) && (j > k)) {
          paramEditable.delete(k, j);
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      if ((!bg.L(paramEditable)) && (bg.getDouble(paramEditable.toString(), 0.0D) > 0.0D)) {
        LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).put(this.username, paramEditable.toString());
      }
      for (;;)
      {
        LaunchAAByPersonAmountSelectUI.j(LaunchAAByPersonAmountSelectUI.this).removeCallbacks(LaunchAAByPersonAmountSelectUI.i(LaunchAAByPersonAmountSelectUI.this));
        LaunchAAByPersonAmountSelectUI.j(LaunchAAByPersonAmountSelectUI.this).postDelayed(LaunchAAByPersonAmountSelectUI.i(LaunchAAByPersonAmountSelectUI.this), 50L);
        GMTrace.o(5633520697344L, 41973);
        return;
        LaunchAAByPersonAmountSelectUI.c(LaunchAAByPersonAmountSelectUI.this).remove(this.username);
      }
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(5633252261888L, 41971);
      GMTrace.o(5633252261888L, 41971);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(5633386479616L, 41972);
      GMTrace.o(5633386479616L, 41972);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\LaunchAAByPersonAmountSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */