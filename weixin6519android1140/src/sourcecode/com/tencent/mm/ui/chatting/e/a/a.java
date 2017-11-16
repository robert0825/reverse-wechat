package com.tencent.mm.ui.chatting.e.a;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.Spannable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.normsg.a.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.widget.MMTextView.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.b.b;
import com.tencent.mm.y.b.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  private static volatile a wPg;
  private static final af wPh;
  
  static
  {
    GMTrace.i(14953197076480L, 111410);
    wPg = null;
    wPh = new af();
    GMTrace.o(14953197076480L, 111410);
  }
  
  private a()
  {
    GMTrace.i(14952391770112L, 111404);
    GMTrace.o(14952391770112L, 111404);
  }
  
  public static void a(CharSequence paramCharSequence, au paramau)
  {
    GMTrace.i(17805860667392L, 132664);
    a(paramCharSequence, paramau, 1);
    GMTrace.o(17805860667392L, 132664);
  }
  
  public static void a(CharSequence paramCharSequence, au paramau, int paramInt)
  {
    GMTrace.i(17805726449664L, 132663);
    if ((paramCharSequence instanceof Spannable)) {
      wPh.A(new b(paramCharSequence, paramau, paramInt));
    }
    GMTrace.o(17805726449664L, 132663);
  }
  
  public static a cgb()
  {
    GMTrace.i(14952525987840L, 111405);
    if (wPg == null) {
      try
      {
        if (wPg == null) {
          wPg = new a();
        }
        a locala1 = wPg;
        GMTrace.o(14952525987840L, 111405);
        return locala1;
      }
      finally {}
    }
    a locala2 = wPg;
    GMTrace.o(14952525987840L, 111405);
    return locala2;
  }
  
  public static MMTextView.a cgc()
  {
    GMTrace.i(17805592231936L, 132662);
    a locala = a.wPi;
    GMTrace.o(17805592231936L, 132662);
    return locala;
  }
  
  private static enum a
    implements MMTextView.a
  {
    static
    {
      GMTrace.i(17805458014208L, 132661);
      wPi = new a("TEXT_CALLBACK");
      wPj = new a[] { wPi };
      GMTrace.o(17805458014208L, 132661);
    }
    
    private a()
    {
      GMTrace.i(17805189578752L, 132659);
      GMTrace.o(17805189578752L, 132659);
    }
    
    public final void a(CharSequence paramCharSequence, long paramLong)
    {
      GMTrace.i(17805323796480L, 132660);
      au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramLong);
      if (bg.nm(localau.field_talker))
      {
        w.w("MicroMsg.AAChattingHelper", "hy: not retrieving correct msg from db. try use old one. msg id: %d", new Object[] { Long.valueOf(paramLong) });
        GMTrace.o(17805323796480L, 132660);
        return;
      }
      if ((localau.field_flag & 0x10) == 0)
      {
        a.a(paramCharSequence, localau, 0);
        GMTrace.o(17805323796480L, 132660);
        return;
      }
      w.v("MicroMsg.AAChattingHelper", "hy: show already checked. msg id is: %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(17805323796480L, 132660);
    }
  }
  
  private static final class b
    implements Runnable
  {
    private au eAH;
    private int scene;
    private CharSequence text;
    
    b(CharSequence paramCharSequence, au paramau, int paramInt)
    {
      GMTrace.i(17805994885120L, 132665);
      this.text = paramCharSequence;
      this.eAH = paramau;
      this.scene = paramInt;
      GMTrace.o(17805994885120L, 132665);
    }
    
    public final void run()
    {
      int i = 0;
      GMTrace.i(14951183810560L, 111395);
      if ((this.text instanceof Spannable)) {}
      for (;;)
      {
        try
        {
          Spannable localSpannable = (Spannable)this.text;
          System.nanoTime();
          Object[] arrayOfObject = localSpannable.getSpans(0, localSpannable.length(), Object.class);
          Object localObject3 = new ArrayList(1);
          if ((arrayOfObject == null) || (arrayOfObject.length == 0)) {
            break label402;
          }
          int j = arrayOfObject.length;
          Object localObject1 = localObject3;
          if (i < j)
          {
            localObject1 = arrayOfObject[i];
            if (!d.nxJ.a(localObject1, l.class)) {
              break label395;
            }
            ((ArrayList)localObject3).add(new a.b.a.a().a(localObject1, localSpannable));
            break label395;
          }
          if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0)) {
            break label386;
          }
          this.eAH = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(this.eAH.field_msgId);
          if ((this.eAH != null) && (!bg.nm(this.eAH.field_talker)))
          {
            this.eAH.dL(this.eAH.field_flag | 0x10);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.eAH.field_msgId, this.eAH);
          }
          at.AR().zt().Ck();
          at.AR().zt().b(b.b.gpR);
          localObject1 = ((ArrayList)localObject1).iterator();
          if (!((Iterator)localObject1).hasNext()) {
            break label386;
          }
          localObject3 = ((c)((Iterator)localObject1).next()).extInfo;
          g.ork.i(14237, new Object[] { "msg", Long.valueOf(this.eAH.field_msgId), Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Build.VERSION.INCREMENTAL, Build.DISPLAY, Integer.valueOf(this.scene), localObject3 });
          g.ork.a(587L, 0L, 1L, false);
          continue;
          GMTrace.o(14951183810560L, 111395);
        }
        catch (Exception localException) {}
        return;
        label386:
        GMTrace.o(14951183810560L, 111395);
        return;
        label395:
        i += 1;
        continue;
        label402:
        Object localObject2 = null;
      }
    }
    
    private static final class a
    {
      private static final class a
        implements a.b.b
      {
        public a()
        {
          GMTrace.i(14951452246016L, 111397);
          GMTrace.o(14951452246016L, 111397);
        }
        
        public final a.b.c a(Object paramObject, Spannable paramSpannable)
        {
          GMTrace.i(14951586463744L, 111398);
          String str = paramSpannable.toString().substring(paramSpannable.getSpanStart(paramObject), paramSpannable.getSpanEnd(paramObject));
          try
          {
            paramSpannable = bg.aq(new JSONObject(paramObject.toString()).optString("type"), paramObject.getClass().getName());
            paramObject = paramSpannable;
          }
          catch (JSONException paramSpannable)
          {
            for (;;)
            {
              paramObject = paramObject.getClass().getName();
            }
          }
          paramObject = new a.b.c(str, (String)paramObject);
          GMTrace.o(14951586463744L, 111398);
          return (a.b.c)paramObject;
        }
      }
    }
    
    private static abstract interface b
    {
      public abstract a.b.c a(Object paramObject, Spannable paramSpannable);
    }
    
    private static final class c
    {
      String extInfo;
      String text;
      
      c(String paramString1, String paramString2)
      {
        GMTrace.i(14951854899200L, 111400);
        this.text = paramString1;
        this.extInfo = paramString2;
        GMTrace.o(14951854899200L, 111400);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\e\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */