package com.tencent.mm.plugin.gallery;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(11976382087168L, 89231);
    GMTrace.o(11976382087168L, 89231);
  }
  
  public o createApplication()
  {
    GMTrace.i(11976516304896L, 89232);
    o local1 = new o()
    {
      public final void a(l paramAnonymousl)
      {
        GMTrace.i(11895046144000L, 88625);
        GMTrace.o(11895046144000L, 88625);
      }
      
      public final void a(m paramAnonymousm)
      {
        GMTrace.i(11894911926272L, 88624);
        GMTrace.o(11894911926272L, 88624);
      }
    };
    GMTrace.o(11976516304896L, 89232);
    return local1;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(11976784740352L, 89234);
    aq local2 = new aq()
    {
      public final void aX(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11977321611264L, 89238);
        GMTrace.o(11977321611264L, 89238);
      }
      
      public final void aY(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11977455828992L, 89239);
        GMTrace.o(11977455828992L, 89239);
      }
      
      public final void eI(int paramAnonymousInt)
      {
        GMTrace.i(11977187393536L, 89237);
        GMTrace.o(11977187393536L, 89237);
      }
      
      public final void onAccountRelease()
      {
        GMTrace.i(11977590046720L, 89240);
        GMTrace.o(11977590046720L, 89240);
      }
      
      public final HashMap<Integer, g.d> vH()
      {
        GMTrace.i(11977053175808L, 89236);
        GMTrace.o(11977053175808L, 89236);
        return null;
      }
    };
    GMTrace.o(11976784740352L, 89234);
    return local2;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(11976650522624L, 89233);
    GMTrace.o(11976650522624L, 89233);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */