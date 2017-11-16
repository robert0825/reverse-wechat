package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.a.c.g;
import com.tencent.mm.ao.a.d.b;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.p;
import com.tencent.mm.v.a.f;

@com.tencent.mm.ui.base.a(19)
public class GameGalleryUI
  extends MMActivity
  implements ViewPager.e
{
  private String appId;
  private MMDotView iPE;
  private int kSi;
  private ViewPager kqK;
  private int lXV;
  
  public GameGalleryUI()
  {
    GMTrace.i(12658476580864L, 94313);
    this.appId = "";
    this.kSi = -1;
    this.lXV = 0;
    GMTrace.o(12658476580864L, 94313);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(12659013451776L, 94317);
    this.iPE.BV(paramInt);
    ai.a(this, this.kSi, 1202, paramInt + 1, 12, this.appId, this.lXV, null);
    GMTrace.o(12659013451776L, 94317);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(12659147669504L, 94318);
    GMTrace.o(12659147669504L, 94318);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(12658879234048L, 94316);
    GMTrace.o(12658879234048L, 94316);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12658745016320L, 94315);
    int i = R.i.bDV;
    GMTrace.o(12658745016320L, 94315);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12658610798592L, 94314);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.kqK = ((ViewPager)findViewById(R.h.bDV));
    this.iPE = ((MMDotView)findViewById(R.h.bDX));
    paramBundle = getIntent().getStringArrayExtra("URLS");
    if (paramBundle == null)
    {
      finish();
      GMTrace.o(12658610798592L, 94314);
      return;
    }
    int j = getIntent().getIntExtra("CURRENT", 0);
    int i;
    if (j >= 0)
    {
      i = j;
      if (j < paramBundle.length) {}
    }
    else
    {
      i = 0;
    }
    this.appId = getIntent().getStringExtra("REPORT_APPID");
    this.kSi = getIntent().getIntExtra("REPORT_SCENE", -1);
    this.lXV = getIntent().getIntExtra("SOURCE_SCENE", 0);
    Object localObject = new a(this, paramBundle);
    this.kqK.a((u)localObject);
    this.kqK.yr = this;
    this.kqK.c(i, false);
    localObject = this.iPE;
    ((MMDotView)localObject).wbw = a.f.aYL;
    ((MMDotView)localObject).wbx = a.f.gcH;
    this.iPE.BU(paramBundle.length);
    this.iPE.BV(i);
    if (i == 0) {
      ai.a(this, this.kSi, 1202, 1, 12, this.appId, this.lXV, null);
    }
    GMTrace.o(12658610798592L, 94314);
  }
  
  private static final class a
    extends u
  {
    private String[] lXW;
    private View[] lXX;
    public Context mContext;
    
    public a(Context paramContext, String[] paramArrayOfString)
    {
      GMTrace.i(12750952595456L, 95002);
      this.lXW = new String[0];
      this.mContext = paramContext;
      if (paramArrayOfString != null) {
        this.lXW = paramArrayOfString;
      }
      this.lXX = new View[this.lXW.length];
      GMTrace.o(12750952595456L, 95002);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(12751221030912L, 95004);
      paramViewGroup.removeView((View)paramObject);
      GMTrace.o(12751221030912L, 95004);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(12751489466368L, 95006);
      if (paramView == paramObject)
      {
        GMTrace.o(12751489466368L, 95006);
        return true;
      }
      GMTrace.o(12751489466368L, 95006);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(12751086813184L, 95003);
      Object localObject2 = this.lXX[paramInt];
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = View.inflate(this.mContext, R.i.cyH, null);
        this.lXX[paramInt] = localObject1;
        localObject2 = (ImageView)((View)localObject1).findViewById(R.h.bDW);
        final ProgressBar localProgressBar = (ProgressBar)((View)localObject1).findViewById(R.h.bDY);
        localProgressBar.setVisibility(0);
        com.tencent.mm.ao.a.a locala = n.Jd();
        String str = this.lXW[paramInt];
        c.a locala1 = new c.a();
        locala1.gKB = true;
        locala.a(str, (ImageView)localObject2, locala1.Jn(), new g()
        {
          public final void a(String paramAnonymousString, View paramAnonymousView, b paramAnonymousb)
          {
            GMTrace.i(12687601827840L, 94530);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12717800816640L, 94755);
                GameGalleryUI.a.1.this.lXY.setVisibility(8);
                GMTrace.o(12717800816640L, 94755);
              }
            });
            GMTrace.o(12687601827840L, 94530);
          }
          
          public final void ku(String paramAnonymousString)
          {
            GMTrace.i(12687467610112L, 94529);
            GMTrace.o(12687467610112L, 94529);
          }
        });
      }
      paramViewGroup.addView((View)localObject1);
      ((View)localObject1).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12684514820096L, 94507);
          ((MMActivity)GameGalleryUI.a.this.mContext).finish();
          GMTrace.o(12684514820096L, 94507);
        }
      });
      GMTrace.o(12751086813184L, 95003);
      return localObject1;
    }
    
    public final int getCount()
    {
      GMTrace.i(12751355248640L, 95005);
      int i = this.lXW.length;
      GMTrace.o(12751355248640L, 95005);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */