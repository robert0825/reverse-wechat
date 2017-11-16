package com.tencent.mm.plugin.webview.fts;

import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.webview.model.z;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.ui.widget.f.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a
{
  private static final a rBo;
  public Map<Integer, f> rBm;
  public c rBn;
  
  static
  {
    GMTrace.i(19471502671872L, 145074);
    rBo = new a();
    GMTrace.o(19471502671872L, 145074);
  }
  
  private a()
  {
    GMTrace.i(19471368454144L, 145073);
    this.rBm = new HashMap();
    c.a locala = new c.a();
    locala.gKC = true;
    locala.gKB = true;
    this.rBn = locala.Jn();
    GMTrace.o(19471368454144L, 145073);
  }
  
  public static a bBG()
  {
    GMTrace.i(19471234236416L, 145072);
    a locala = rBo;
    GMTrace.o(19471234236416L, 145072);
    return locala;
  }
  
  public static abstract interface a
  {
    public abstract void dD(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */