package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.EditText;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.d.e.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.y;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public final class d
{
  public static <Input extends EditText,  extends y> void a(final AppBrandPageView paramAppBrandPageView, Input paramInput, a.a parama)
  {
    GMTrace.i(18258174410752L, 136034);
    if (!((y)paramInput).acM())
    {
      GMTrace.o(18258174410752L, 136034);
      return;
    }
    paramAppBrandPageView = new WeakReference(paramAppBrandPageView);
    paramAppBrandPageView = new h()
    {
      public final void a(String paramAnonymousString, h.a paramAnonymousa)
      {
        GMTrace.i(18261932507136L, 136062);
        Object localObject = (EditText)this.iOW.get();
        AppBrandPageView localAppBrandPageView = (AppBrandPageView)paramAppBrandPageView.get();
        if ((localObject == null) || (localAppBrandPageView == null))
        {
          GMTrace.o(18261932507136L, 136062);
          return;
        }
        localObject = ((y)localObject).acd();
        if (bg.nm((String)localObject))
        {
          GMTrace.o(18261932507136L, 136062);
          return;
        }
        e.a locala = new e.a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("id", paramAnonymousString);
        localHashMap.put("type", paramAnonymousa.name().toLowerCase());
        localHashMap.put("inputId", localObject);
        locala.ai(localAppBrandPageView.hyD, localAppBrandPageView.hashCode()).r(localHashMap).f(new int[] { localAppBrandPageView.hashCode() });
        GMTrace.o(18261932507136L, 136062);
      }
    };
    paramInput = ((y)paramInput).ada();
    Object localObject = parama.iPU;
    paramInput.iOJ = new a(paramInput.iOD.getContext(), (List)localObject);
    paramInput.iOJ.iOw = paramInput.iOH;
    localObject = paramInput.iOE;
    a locala = paramInput.iOJ;
    if (((AutoFillListPopupWindowBase)localObject).mObserver == null)
    {
      ((AutoFillListPopupWindowBase)localObject).mObserver = new AutoFillListPopupWindowBase.c((AutoFillListPopupWindowBase)localObject, (byte)0);
      ((AutoFillListPopupWindowBase)localObject).EP = locala;
      if (((AutoFillListPopupWindowBase)localObject).EP != null) {
        locala.registerDataSetObserver(((AutoFillListPopupWindowBase)localObject).mObserver);
      }
      if (((AutoFillListPopupWindowBase)localObject).iOX != null) {
        ((AutoFillListPopupWindowBase)localObject).iOX.setAdapter(((AutoFillListPopupWindowBase)localObject).EP);
      }
      paramInput.iOH.iOP = paramAppBrandPageView;
      if (!"screen".equalsIgnoreCase(parama.iPT)) {
        break label259;
      }
    }
    label259:
    for (int i = f.iPe;; i = f.iPf)
    {
      if (i != 0) {
        paramInput.iOI = i;
      }
      paramInput.adq();
      GMTrace.o(18258174410752L, 136034);
      return;
      if (((AutoFillListPopupWindowBase)localObject).EP == null) {
        break;
      }
      ((AutoFillListPopupWindowBase)localObject).EP.unregisterDataSetObserver(((AutoFillListPopupWindowBase)localObject).mObserver);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\autofill\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */