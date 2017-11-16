package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public final class h
{
  private int bgColor;
  private Context context;
  private int jsh;
  private int jsi;
  private ViewGroup nWe;
  private LinkedHashMap<String, i> pKm;
  private LayoutInflater pKn;
  private List<s> pLS;
  
  public h(List<s> paramList, Context paramContext, int paramInt, ViewGroup paramViewGroup)
  {
    GMTrace.i(8203253317632L, 61119);
    this.pLS = paramList;
    this.context = paramContext;
    this.bgColor = paramInt;
    this.nWe = paramViewGroup;
    GMTrace.o(8203253317632L, 61119);
  }
  
  public final Collection<i> blp()
  {
    GMTrace.i(18581907570688L, 138446);
    if (this.pKm == null)
    {
      localObject = Collections.EMPTY_LIST;
      GMTrace.o(18581907570688L, 138446);
      return (Collection<i>)localObject;
    }
    Object localObject = this.pKm.values();
    GMTrace.o(18581907570688L, 138446);
    return (Collection<i>)localObject;
  }
  
  public final void bx(List<s> paramList)
  {
    GMTrace.i(8203387535360L, 61120);
    if ((paramList != null) && (!paramList.equals(this.pLS)))
    {
      this.pLS = paramList;
      layout();
    }
    GMTrace.o(8203387535360L, 61120);
  }
  
  public final void layout()
  {
    GMTrace.i(8203521753088L, 61121);
    if ((this.pLS == null) || (this.pLS.isEmpty()))
    {
      GMTrace.o(8203521753088L, 61121);
      return;
    }
    if (this.pKm == null) {
      this.pKm = new LinkedHashMap();
    }
    Object localObject;
    if (this.pKn == null)
    {
      this.pKn = ((LayoutInflater)this.context.getSystemService("layout_inflater"));
      localObject = (WindowManager)this.context.getSystemService("window");
      this.jsh = ((WindowManager)localObject).getDefaultDisplay().getWidth();
      this.jsi = ((WindowManager)localObject).getDefaultDisplay().getHeight();
    }
    int i = 0;
    for (;;)
    {
      if (i < this.pLS.size())
      {
        s locals = (s)this.pLS.get(i);
        localObject = (i)this.pKm.get(locals.pEz);
        if (localObject != null) {
          ((i)localObject).a(locals);
        }
        try
        {
          label172:
          if (this.nWe != ((i)localObject).getView().getParent())
          {
            if (this.nWe.getChildCount() <= i) {
              break label259;
            }
            this.nWe.addView(((i)localObject).getView(), i);
          }
          for (;;)
          {
            i += 1;
            break;
            i locali = am.a(this.context, locals, this.nWe, this.bgColor);
            localObject = locali;
            if (locali == null) {
              break label172;
            }
            this.pKm.put(locals.pEz, locali);
            localObject = locali;
            break label172;
            label259:
            this.nWe.addView(((i)localObject).getView());
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("CompRenderer", "component may have same id %s,%s", new Object[] { locals.pEz, bg.f(localException) });
          }
        }
      }
    }
    GMTrace.o(8203521753088L, 61121);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */