package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.n;
import com.tencent.mm.aw.k;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.a;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.y.at;

@a(3)
public class BrandServiceLocalSearchUI
  extends MMActivity
  implements BrandServiceSortView.a, p.a
{
  private com.tencent.mm.pluginsdk.ui.tools.p jus;
  private BrandServiceSortView jut;
  
  public BrandServiceLocalSearchUI()
  {
    GMTrace.i(10911364415488L, 81296);
    GMTrace.o(10911364415488L, 81296);
  }
  
  protected final void MP()
  {
    GMTrace.i(10911767068672L, 81299);
    this.jut = ((BrandServiceSortView)findViewById(R.h.cfv));
    this.jut.cbb();
    this.jut.juq = getIntent().getBooleanExtra("is_return_result", false);
    this.jut.cbc();
    this.jut.lQ(false);
    this.jut.L(false);
    this.jut.jvC = this;
    this.jus = new com.tencent.mm.pluginsdk.ui.tools.p();
    this.jus.mD(true);
    this.jus.a(this);
    this.jus.tHZ = false;
    GMTrace.o(10911767068672L, 81299);
  }
  
  public final void QA()
  {
    GMTrace.i(10911632850944L, 81298);
    GMTrace.o(10911632850944L, 81298);
  }
  
  public final void QB()
  {
    GMTrace.i(16937740402688L, 126196);
    GMTrace.o(16937740402688L, 126196);
  }
  
  public final void Qy()
  {
    GMTrace.i(10912035504128L, 81301);
    finish();
    GMTrace.o(10912035504128L, 81301);
  }
  
  public final void Qz()
  {
    GMTrace.i(10911901286400L, 81300);
    GMTrace.o(10911901286400L, 81300);
  }
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    GMTrace.i(10913243463680L, 81310);
    GMTrace.o(10913243463680L, 81310);
  }
  
  public final void aim()
  {
    GMTrace.i(10912438157312L, 81304);
    aLo();
    GMTrace.o(10912438157312L, 81304);
  }
  
  public final void ain()
  {
    GMTrace.i(10912572375040L, 81305);
    GMTrace.o(10912572375040L, 81305);
  }
  
  public final boolean aio()
  {
    GMTrace.i(10913511899136L, 81312);
    aLo();
    GMTrace.o(10913511899136L, 81312);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10913377681408L, 81311);
    int i = R.i.cqz;
    GMTrace.o(10913377681408L, 81311);
    return i;
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(10912303939584L, 81303);
    aLo();
    GMTrace.o(10912303939584L, 81303);
    return true;
  }
  
  public final void nD(String paramString)
  {
    GMTrace.i(10912169721856L, 81302);
    w.i("MicroMsg.BrandServiceLocalSearchUI", "search biz, key word : %s", new Object[] { paramString });
    this.jut.VK(paramString);
    GMTrace.o(10912169721856L, 81302);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10911498633216L, 81297);
    super.onCreate(paramBundle);
    MP();
    paramBundle = new k(18);
    at.wS().a(paramBundle, 0);
    GMTrace.o(10911498633216L, 81297);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(10912975028224L, 81308);
    this.jus.a(this, paramMenu);
    GMTrace.o(10912975028224L, 81308);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10912840810496L, 81307);
    super.onDestroy();
    this.jut.release();
    GMTrace.o(10912840810496L, 81307);
  }
  
  protected void onPause()
  {
    GMTrace.i(10912706592768L, 81306);
    super.onPause();
    this.jus.cancel();
    this.jus.clearFocus();
    GMTrace.o(10912706592768L, 81306);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(10913109245952L, 81309);
    this.jus.a(this, paramMenu);
    GMTrace.o(10913109245952L, 81309);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\BrandServiceLocalSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */