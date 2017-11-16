package com.tencent.mm.plugin.favorite.ui.post;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.m;
import com.tencent.mm.plugin.favorite.c.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.MMTextInputUI;

public class FavPostTextUI
  extends MMTextInputUI
{
  public FavPostTextUI()
  {
    GMTrace.i(6355477856256L, 47352);
    GMTrace.o(6355477856256L, 47352);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6355612073984L, 47353);
    int i = R.i.cwq;
    GMTrace.o(6355612073984L, 47353);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6355746291712L, 47354);
    super.onCreate(paramBundle);
    oM(R.l.dum);
    GMTrace.o(6355746291712L, 47354);
  }
  
  protected final void y(CharSequence paramCharSequence)
  {
    GMTrace.i(6355880509440L, 47355);
    if ((paramCharSequence == null) || (bg.nm(paramCharSequence.toString())))
    {
      w.w("MicroMsg.MMTextInputUI", "text is null");
      GMTrace.o(6355880509440L, 47355);
      return;
    }
    paramCharSequence = paramCharSequence.toString();
    if ((bg.nm(paramCharSequence)) || (paramCharSequence.trim().length() == 0))
    {
      w.e("MicroMsg.FavPostLogic", "postText text null");
      GMTrace.o(6355880509440L, 47355);
      return;
    }
    j localj = new j();
    localj.field_type = 1;
    localj.field_sourceType = 6;
    localj.field_favProto.QX(paramCharSequence);
    m.f(localj);
    a.z(localj);
    g.ork.i(10648, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
    GMTrace.o(6355880509440L, 47355);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\post\FavPostTextUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */