package com.tencent.mm.app;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.conversation.j;
import com.tencent.mm.ui.l;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.d.a.4;
import com.tencent.mm.y.d.b;
import com.tencent.mm.y.d.b.1;
import com.tencent.mm.y.d.c;
import com.tencent.mm.y.d.c.1;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class k
{
  public static k esO;
  public boolean esP;
  public ae esQ;
  
  public k()
  {
    GMTrace.i(12962211299328L, 96576);
    this.esQ = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(13042876153856L, 97177);
        super.handleMessage(paramAnonymousMessage);
        Object localObject3;
        if (paramAnonymousMessage.what == 63537)
        {
          if (!k.this.esP)
          {
            paramAnonymousMessage = LauncherUI.bXe();
            if ((paramAnonymousMessage != null) && (paramAnonymousMessage.vJl))
            {
              paramAnonymousMessage.vJi.vIy.Vi("tab_main");
              Object localObject1 = paramAnonymousMessage.vJi;
              if (((HomeUI)localObject1).vIn)
              {
                ((HomeUI)localObject1).vIp = true;
                ((HomeUI)localObject1).vIF.setBackgroundDrawable(null);
                localObject1 = ((HomeUI)localObject1).vIF;
                ((VoiceSearchLayout)localObject1).tvX.setBackgroundDrawable(null);
                ((VoiceSearchLayout)localObject1).twb.setBackgroundDrawable(null);
                ((VoiceSearchLayout)localObject1).twc = null;
              }
              for (;;)
              {
                try
                {
                  localObject1 = ab.getContext().getResources();
                  if (localObject1 != null) {}
                }
                catch (Exception localException1)
                {
                  com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.ActivityResourceRecycler", localException1, "", new Object[0]);
                  continue;
                  localObject3 = localException1.getClass().getDeclaredField("mColorStateListCache");
                  ((Field)localObject3).setAccessible(true);
                  Object localObject2 = ((Field)localObject3).get(localException1);
                  if ((localObject2 instanceof SparseArray))
                  {
                    ((SparseArray)localObject2).clear();
                    continue;
                  }
                }
                try
                {
                  localObject1 = ab.getContext().getResources();
                  if (localObject1 != null) {
                    break;
                  }
                }
                catch (Exception localException2)
                {
                  com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.ActivityResourceRecycler", localException2, "", new Object[0]);
                  continue;
                  ((LongSparseArray)localException2).clear();
                  continue;
                  localObject3 = localException2.getClass().getDeclaredField("mColorDrawableCache");
                  ((Field)localObject3).setAccessible(true);
                  ((LongSparseArray)((Field)localObject3).get(localException2)).clear();
                  localObject3 = localException2.getClass().getDeclaredField("sPreloadedColorDrawables");
                  ((Field)localObject3).setAccessible(true);
                  ((LongSparseArray)((Field)localObject3).get(localException2)).clear();
                  continue;
                }
                try
                {
                  if (Build.VERSION.SDK_INT >= 16)
                  {
                    localObject1 = ab.getContext().getResources();
                    if (localObject1 != null) {
                      break label332;
                    }
                  }
                }
                catch (Exception localException3)
                {
                  com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.ActivityResourceRecycler", localException3, "", new Object[0]);
                  continue;
                }
                localObject1 = com.tencent.mm.plugin.sns.b.n.poO;
                if (localObject1 != null) {
                  ((f)localObject1).bhO();
                }
                paramAnonymousMessage = paramAnonymousMessage.vJi.vIy.vMY.values().iterator();
                if (!paramAnonymousMessage.hasNext()) {
                  break label403;
                }
                localObject1 = (Fragment)paramAnonymousMessage.next();
                if (!(localObject1 instanceof j))
                {
                  ((l)localObject1).bVS();
                  continue;
                  localObject3 = localObject1.getClass().getDeclaredField("mDrawableCache");
                  ((Field)localObject3).setAccessible(true);
                  ((LongSparseArray)((Field)localObject3).get(localObject1)).clear();
                }
              }
            }
            label332:
            label403:
            System.gc();
            GMTrace.o(13042876153856L, 97177);
          }
        }
        else if (paramAnonymousMessage.what == 62537)
        {
          if (k.this.esP)
          {
            GMTrace.o(13042876153856L, 97177);
            return;
          }
          paramAnonymousMessage = LauncherUI.bXe();
          if (paramAnonymousMessage != null)
          {
            paramAnonymousMessage = paramAnonymousMessage.vJi.vIy;
            if (paramAnonymousMessage.vMY.containsKey(Integer.valueOf(0))) {
              ((l)paramAnonymousMessage.vMY.get(Integer.valueOf(0))).bVS();
            }
          }
          if (h.xw().wL())
          {
            paramAnonymousMessage = at.AK().gZ("plugin.emoji");
            if (paramAnonymousMessage != null) {
              paramAnonymousMessage.eI(0);
            }
            if ((com.tencent.mm.ao.n)at.AK().gZ(com.tencent.mm.ao.n.class.getName()) != null) {
              com.tencent.mm.ao.n.Jf();
            }
            paramAnonymousMessage = b.CA();
            com.tencent.mm.y.d.a locala = com.tencent.mm.y.d.a.Cw();
            localObject3 = c.CC();
            at.xB().A(new b.1(paramAnonymousMessage));
            at.xB().A(new a.4(locala));
            ((c)localObject3).a(paramAnonymousMessage);
            ((c)localObject3).a(locala);
            at.xB().A(new c.1((c)localObject3));
          }
          System.gc();
        }
        GMTrace.o(13042876153856L, 97177);
      }
    };
    GMTrace.o(12962211299328L, 96576);
  }
  
  public static k pj()
  {
    GMTrace.i(12962345517056L, 96577);
    if (esO == null) {
      esO = new k();
    }
    k localk = esO;
    GMTrace.o(12962345517056L, 96577);
    return localk;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */