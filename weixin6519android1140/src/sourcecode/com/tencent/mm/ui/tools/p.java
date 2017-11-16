package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.m;
import android.support.v4.view.m.e;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.j;
import com.tencent.mm.v.a.k;
import java.util.ArrayList;

public class p
{
  public final String TAG;
  public ae ghS;
  public MenuItem leO;
  public boolean xiM;
  public boolean xiN;
  private boolean xiO;
  private boolean xiP;
  public boolean xiQ;
  public f xiR;
  public b xiS;
  private SearchViewNotRealTimeHelper.a xiT;
  private boolean xiU;
  private ArrayList<String> xiV;
  private boolean xiW;
  public int xiX;
  private int xiY;
  public a xiZ;
  
  public p()
  {
    GMTrace.i(2011252654080L, 14985);
    this.xiM = false;
    this.xiN = false;
    this.xiO = false;
    this.xiP = true;
    this.xiQ = true;
    this.leO = null;
    this.ghS = new ae(Looper.getMainLooper());
    this.xiR = null;
    this.xiU = true;
    this.xiX = a.k.cSG;
    this.xiY = 0;
    this.xiU = true;
    this.xiM = false;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
    GMTrace.o(2011252654080L, 14985);
  }
  
  public p(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(2011386871808L, 14986);
    this.xiM = false;
    this.xiN = false;
    this.xiO = false;
    this.xiP = true;
    this.xiQ = true;
    this.leO = null;
    this.ghS = new ae(Looper.getMainLooper());
    this.xiR = null;
    this.xiU = true;
    this.xiX = a.k.cSG;
    this.xiY = 0;
    this.xiU = true;
    this.xiM = true;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
    GMTrace.o(2011386871808L, 14986);
  }
  
  private void b(final Activity paramActivity, Menu paramMenu)
  {
    GMTrace.i(2012729049088L, 14996);
    if ((this.xiP) && ((this.xiN) || (this.xiO)))
    {
      this.xiO = false;
      if (paramMenu != null)
      {
        int i = 0;
        while (i < paramMenu.size())
        {
          MenuItem localMenuItem = paramMenu.getItem(i);
          if (localMenuItem.getItemId() != a.g.bMU) {
            localMenuItem.setVisible(false);
          }
          i += 1;
        }
      }
      this.ghS.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1954746990592L, 14564);
          if (p.this.leO == null)
          {
            w.w(p.this.TAG, "on post expand search menu, but item is null");
            GMTrace.o(1954746990592L, 14564);
            return;
          }
          w.i(p.this.TAG, "try to expand action view, searchViewExpand %B", new Object[] { Boolean.valueOf(p.this.xiN) });
          if (p.this.xiM) {
            if (!p.this.xiN) {
              m.b(p.this.leO);
            }
          }
          for (;;)
          {
            final View localView = m.a(p.this.leO);
            if ((localView != null) && (p.this.xiN))
            {
              localView.findViewById(a.g.bvB).requestFocus();
              if (p.this.xiQ) {
                p.this.ghS.postDelayed(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(1964544884736L, 14637);
                    ((InputMethodManager)p.10.this.na.getSystemService("input_method")).showSoftInput(localView.findViewById(a.g.bvB), 0);
                    GMTrace.o(1964544884736L, 14637);
                  }
                }, 128L);
              }
            }
            GMTrace.o(1954746990592L, 14564);
            return;
            if (p.this.xiZ != null) {
              p.this.xiZ.ciu();
            }
          }
        }
      }, 128L);
    }
    GMTrace.o(2012729049088L, 14996);
  }
  
  public final void WP(String paramString)
  {
    GMTrace.i(2011655307264L, 14988);
    if (this.xiR == null)
    {
      GMTrace.o(2011655307264L, 14988);
      return;
    }
    this.xiR.WP(paramString);
    GMTrace.o(2011655307264L, 14988);
  }
  
  public void a(Activity paramActivity, Menu paramMenu)
  {
    GMTrace.i(2012594831360L, 14995);
    w.v(this.TAG, "on prepare options menu, searchViewExpand %B, triggerExpand %B, canExpand %B", new Object[] { Boolean.valueOf(this.xiN), Boolean.valueOf(this.xiO), Boolean.valueOf(this.xiP) });
    if (paramActivity == null)
    {
      w.w(this.TAG, "on hanle status fail, activity is null");
      GMTrace.o(2012594831360L, 14995);
      return;
    }
    this.leO = paramMenu.findItem(a.g.bMU);
    if (this.leO == null)
    {
      w.w(this.TAG, "can not find search menu, error");
      GMTrace.o(2012594831360L, 14995);
      return;
    }
    this.leO.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1923340042240L, 14330);
        GMTrace.o(1923340042240L, 14330);
        return false;
      }
    });
    b(paramActivity, paramMenu);
    GMTrace.o(2012594831360L, 14995);
  }
  
  public final void a(final FragmentActivity paramFragmentActivity, Menu paramMenu)
  {
    GMTrace.i(2012460613632L, 14994);
    w.v(this.TAG, "on create options menu");
    if (paramFragmentActivity == null)
    {
      w.w(this.TAG, "on add search menu, activity is null");
      GMTrace.o(2012460613632L, 14994);
      return;
    }
    if (this.xiR == null)
    {
      if (this.xiU)
      {
        this.xiR = new ActionBarSearchView(paramFragmentActivity);
        this.xiR.mB(this.xiW);
        this.xiR.ak(this.xiV);
      }
    }
    else
    {
      this.xiR.a(new ActionBarSearchView.b()
      {
        public final void Bv(String paramAnonymousString)
        {
          GMTrace.i(1968705634304L, 14668);
          if (!p.this.xiN)
          {
            w.v(p.this.TAG, "onSearchTextChange %s, but not in searching", new Object[] { paramAnonymousString });
            GMTrace.o(1968705634304L, 14668);
            return;
          }
          if (p.this.xiS != null) {
            p.this.xiS.nD(paramAnonymousString);
          }
          GMTrace.o(1968705634304L, 14668);
        }
        
        public final void QA()
        {
          GMTrace.i(1968839852032L, 14669);
          if (p.this.xiS != null) {
            p.this.xiS.QA();
          }
          GMTrace.o(1968839852032L, 14669);
        }
        
        public final void aLw()
        {
          GMTrace.i(17517829423104L, 130518);
          if (p.this.xiS != null) {
            p.this.xiS.QB();
          }
          GMTrace.o(17517829423104L, 130518);
        }
        
        public final void aLx()
        {
          GMTrace.i(1968571416576L, 14667);
          if (!p.this.xiN)
          {
            w.v(p.this.TAG, "onVoiceSearchRequired, but not in searching");
            GMTrace.o(1968571416576L, 14667);
            return;
          }
          p.this.bNu();
          GMTrace.o(1968571416576L, 14667);
        }
      });
      this.xiR.mx(bNt());
      this.xiR.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          GMTrace.i(1972866383872L, 14699);
          if ((3 == paramAnonymousInt) && (p.this.xiS != null))
          {
            boolean bool = p.this.xiS.nC(p.this.bFU());
            GMTrace.o(1972866383872L, 14699);
            return bool;
          }
          GMTrace.o(1972866383872L, 14699);
          return false;
        }
      });
      if (this.xiY != 0) {
        this.xiR.DW(this.xiY);
      }
      this.leO = paramMenu.add(0, a.g.bMU, 0, this.xiX);
      this.leO.setEnabled(this.xiP);
      this.leO.setIcon(a.j.cIS);
      m.a(this.leO, (View)this.xiR);
      if (!this.xiM) {
        break label316;
      }
      m.a(this.leO, 9);
      label237:
      if (!this.xiM) {
        break label327;
      }
      m.a(this.leO, new m.e()
      {
        public final boolean onMenuItemActionCollapse(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1964008013824L, 14633);
          p.this.b(paramFragmentActivity, false);
          GMTrace.o(1964008013824L, 14633);
          return true;
        }
        
        public final boolean onMenuItemActionExpand(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1963873796096L, 14632);
          p.this.a(paramFragmentActivity, false);
          GMTrace.o(1963873796096L, 14632);
          return true;
        }
      });
    }
    for (;;)
    {
      this.xiR.a(new ActionBarSearchView.a()
      {
        public final void aLy()
        {
          GMTrace.i(1994609655808L, 14861);
          if (p.this.xiM)
          {
            if (p.this.leO != null)
            {
              m.c(p.this.leO);
              GMTrace.o(1994609655808L, 14861);
            }
          }
          else if (p.this.xiZ != null) {
            p.this.xiZ.collapseActionView();
          }
          GMTrace.o(1994609655808L, 14861);
        }
      });
      GMTrace.o(2012460613632L, 14994);
      return;
      this.xiR = new SearchViewNotRealTimeHelper(paramFragmentActivity);
      this.xiR.a(this.xiT);
      break;
      label316:
      m.a(this.leO, 2);
      break label237;
      label327:
      this.xiZ = new a()
      {
        public final void ciu()
        {
          GMTrace.i(2050846883840L, 15280);
          p.this.a(paramFragmentActivity, true);
          GMTrace.o(2050846883840L, 15280);
        }
        
        public final void collapseActionView()
        {
          GMTrace.i(2050981101568L, 15281);
          p.this.b(paramFragmentActivity, true);
          GMTrace.o(2050981101568L, 15281);
        }
      };
    }
  }
  
  public final void a(final FragmentActivity paramFragmentActivity, final boolean paramBoolean)
  {
    GMTrace.i(2013534355456L, 15002);
    w.d(this.TAG, "doNewExpand, searchViewExpand " + this.xiN);
    if (!this.xiN)
    {
      this.xiN = true;
      b(paramFragmentActivity, null);
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1964813320192L, 14639);
          if ((paramFragmentActivity == null) || (paramFragmentActivity.isFinishing()))
          {
            w.w(p.this.TAG, "want to expand search view, but activity status error");
            GMTrace.o(1964813320192L, 14639);
            return;
          }
          if (paramBoolean) {
            paramFragmentActivity.aQ();
          }
          GMTrace.o(1964813320192L, 14639);
        }
      });
      if (this.xiS != null) {
        this.xiS.Qz();
      }
    }
    GMTrace.o(2013534355456L, 15002);
  }
  
  public final void b(final FragmentActivity paramFragmentActivity, final boolean paramBoolean)
  {
    GMTrace.i(2013668573184L, 15003);
    w.d(this.TAG, "doNewCollapse, searchViewExpand " + this.xiN);
    if (this.xiN)
    {
      this.xiN = false;
      bNv();
      if (this.xiR != null) {
        this.xiR.mA(false);
      }
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1941056782336L, 14462);
          if ((paramFragmentActivity == null) || (paramFragmentActivity.isFinishing()))
          {
            w.w(p.this.TAG, "want to collapse search view, but activity status error");
            GMTrace.o(1941056782336L, 14462);
            return;
          }
          if (paramBoolean) {
            paramFragmentActivity.aQ();
          }
          GMTrace.o(1941056782336L, 14462);
        }
      });
      if (this.xiS != null) {
        this.ghS.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1968034545664L, 14663);
            p.this.xiS.Qy();
            GMTrace.o(1968034545664L, 14663);
          }
        });
      }
    }
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1943070048256L, 14477);
        if (p.this.leO == null)
        {
          w.w(p.this.TAG, "want to collapse search view, but search menu item is null");
          GMTrace.o(1943070048256L, 14477);
          return;
        }
        if ((paramFragmentActivity != null) && (!paramFragmentActivity.isFinishing()))
        {
          Object localObject2 = paramFragmentActivity;
          localObject1 = (InputMethodManager)((FragmentActivity)localObject2).getSystemService("input_method");
          if (localObject1 != null)
          {
            localObject2 = ((FragmentActivity)localObject2).getCurrentFocus();
            if (localObject2 != null)
            {
              localObject2 = ((View)localObject2).getWindowToken();
              if (localObject2 != null) {
                ((InputMethodManager)localObject1).hideSoftInputFromWindow((IBinder)localObject2, 0);
              }
            }
          }
        }
        Object localObject1 = m.a(p.this.leO);
        if (localObject1 != null) {
          ((View)localObject1).findViewById(a.g.bvB).clearFocus();
        }
        GMTrace.o(1943070048256L, 14477);
      }
    });
    GMTrace.o(2013668573184L, 15003);
  }
  
  public final String bFU()
  {
    GMTrace.i(2011521089536L, 14987);
    if (this.xiR != null)
    {
      String str = this.xiR.bFU();
      GMTrace.o(2011521089536L, 14987);
      return str;
    }
    GMTrace.o(2011521089536L, 14987);
    return "";
  }
  
  public boolean bNt()
  {
    GMTrace.i(2012057960448L, 14991);
    GMTrace.o(2012057960448L, 14991);
    return false;
  }
  
  public void bNu()
  {
    GMTrace.i(2012192178176L, 14992);
    GMTrace.o(2012192178176L, 14992);
  }
  
  public void bNv()
  {
    GMTrace.i(2012326395904L, 14993);
    GMTrace.o(2012326395904L, 14993);
  }
  
  public final boolean chW()
  {
    GMTrace.i(2013265920000L, 15000);
    if (this.xiR != null)
    {
      boolean bool = this.xiR.chW();
      GMTrace.o(2013265920000L, 15000);
      return bool;
    }
    GMTrace.o(2013265920000L, 15000);
    return false;
  }
  
  public final boolean chX()
  {
    GMTrace.i(2013400137728L, 15001);
    if (this.xiR != null)
    {
      boolean bool = this.xiR.chX();
      GMTrace.o(2013400137728L, 15001);
      return bool;
    }
    GMTrace.o(2013400137728L, 15001);
    return false;
  }
  
  public final void cit()
  {
    GMTrace.i(2013131702272L, 14999);
    w.d(this.TAG, "do collapse");
    if ((this.xiN) && (this.leO != null))
    {
      if (this.xiM)
      {
        m.c(this.leO);
        GMTrace.o(2013131702272L, 14999);
        return;
      }
      if (this.xiZ != null) {
        this.xiZ.collapseActionView();
      }
    }
    GMTrace.o(2013131702272L, 14999);
  }
  
  public final void clearFocus()
  {
    GMTrace.i(2011923742720L, 14990);
    if (this.xiR != null) {
      this.xiR.chV();
    }
    GMTrace.o(2011923742720L, 14990);
  }
  
  public final void mD(boolean paramBoolean)
  {
    boolean bool1 = false;
    GMTrace.i(2012997484544L, 14998);
    String str = this.TAG;
    boolean bool2 = this.xiN;
    if (this.leO == null) {
      bool1 = true;
    }
    w.d(str, "do expand, expanded[%B], search menu item null[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
    if (this.xiN)
    {
      GMTrace.o(2012997484544L, 14998);
      return;
    }
    if (!this.xiP)
    {
      w.w(this.TAG, "can not expand now");
      GMTrace.o(2012997484544L, 14998);
      return;
    }
    this.xiQ = paramBoolean;
    if (this.leO != null)
    {
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2016487145472L, 15024);
          if (p.this.leO == null)
          {
            w.w(p.this.TAG, "post do expand search menu, but search menu item is null");
            GMTrace.o(2016487145472L, 15024);
            return;
          }
          if (p.this.xiM)
          {
            m.b(p.this.leO);
            GMTrace.o(2016487145472L, 15024);
            return;
          }
          if (p.this.xiZ != null) {
            p.this.xiZ.ciu();
          }
          GMTrace.o(2016487145472L, 15024);
        }
      });
      GMTrace.o(2012997484544L, 14998);
      return;
    }
    this.xiO = true;
    GMTrace.o(2012997484544L, 14998);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2012863266816L, 14997);
    w.v(this.TAG, "on key down, key code %d, expand %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.xiN) });
    if ((4 == paramInt) && (this.xiN))
    {
      cit();
      GMTrace.o(2012863266816L, 14997);
      return true;
    }
    GMTrace.o(2012863266816L, 14997);
    return false;
  }
  
  public final void setHint(CharSequence paramCharSequence)
  {
    GMTrace.i(2011789524992L, 14989);
    if (this.xiR == null)
    {
      GMTrace.o(2011789524992L, 14989);
      return;
    }
    this.xiR.setHint(paramCharSequence);
    GMTrace.o(2011789524992L, 14989);
  }
  
  public static abstract interface a
  {
    public abstract void ciu();
    
    public abstract void collapseActionView();
  }
  
  public static abstract interface b
  {
    public abstract void QA();
    
    public abstract void QB();
    
    public abstract void Qy();
    
    public abstract void Qz();
    
    public abstract boolean nC(String paramString);
    
    public abstract void nD(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */