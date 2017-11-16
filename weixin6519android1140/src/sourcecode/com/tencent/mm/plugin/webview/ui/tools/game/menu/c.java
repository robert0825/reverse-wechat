package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aob;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class c
{
  private static c rQZ;
  
  public c()
  {
    GMTrace.i(18085570412544L, 134748);
    GMTrace.o(18085570412544L, 134748);
  }
  
  public static c bFj()
  {
    GMTrace.i(18085704630272L, 134749);
    if (rQZ == null) {}
    try
    {
      if (rQZ == null) {
        rQZ = new c();
      }
      c localc = rQZ;
      GMTrace.o(18085704630272L, 134749);
      return localc;
    }
    finally {}
  }
  
  public final n f(List<aob> paramList, boolean paramBoolean)
  {
    GMTrace.i(18085838848000L, 134750);
    if (bg.cc(paramList))
    {
      GMTrace.o(18085838848000L, 134750);
      return null;
    }
    Object localObject = new ArrayList();
    paramList = paramList.iterator();
    aob localaob;
    while (paramList.hasNext())
    {
      localaob = (aob)paramList.next();
      if ((localaob != null) && (a.yi(localaob.und))) {
        ((List)localObject).add(localaob);
      }
    }
    if (bg.cc((List)localObject))
    {
      GMTrace.o(18085838848000L, 134750);
      return null;
    }
    Collections.sort((List)localObject, new Comparator() {});
    int j = ((aob)((List)localObject).get(((List)localObject).size() - 1)).uDZ;
    paramList = new ArrayList();
    int i = 0;
    while (i < j)
    {
      paramList.add(null);
      i += 1;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localaob = (aob)((Iterator)localObject).next();
      if (a.yj(localaob.und) == a.rRg)
      {
        if ((!paramBoolean) && (localaob.uDZ > 0) && (localaob.uDZ <= paramList.size())) {
          paramList.set(localaob.uDZ - 1, localaob);
        }
      }
      else if (a.yj(localaob.und) == a.rRh)
      {
        if ((paramBoolean) && (localaob.uDZ > 0) && (localaob.uDZ <= paramList.size())) {
          paramList.set(localaob.uDZ - 1, localaob);
        }
      }
      else if ((localaob.uDZ > 0) && (localaob.uDZ <= paramList.size())) {
        paramList.set(localaob.uDZ - 1, localaob);
      }
    }
    localObject = new n();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localaob = (aob)paramList.next();
      if (localaob == null)
      {
        ((n)localObject).e(-1, "");
      }
      else
      {
        String str = localaob.eBt + "__" + localaob.nFH;
        ((n)localObject).e(localaob.uDY, str);
      }
    }
    GMTrace.o(18085838848000L, 134750);
    return (n)localObject;
  }
  
  public static enum a
  {
    private static EnumMap<a, Integer> rRm;
    int code;
    
    static
    {
      GMTrace.i(18083020275712L, 134729);
      rRb = new a("HVGAME_MENU_ACTION_DEFAULT", 0, 0);
      rRc = new a("HVGAME_MENU_ACTION_JUMP_H5", 1, 1);
      rRd = new a("HVGAME_MENU_ACTION_EXIT", 2, 2);
      rRe = new a("HVGAME_MENU_ACTION_SHARE_TO_FRIEND", 3, 3);
      rRf = new a("HVGAME_MENU_ACTION_COLLECT", 4, 4);
      rRg = new a("HVGAME_MENU_ACTION_STICK_ON", 5, 5);
      rRh = new a("HVGAME_MENU_ACTION_STICK_OFF", 6, 6);
      rRi = new a("HVGAME_MENU_ACTION_REFRESH", 7, 7);
      rRj = new a("HVGAME_MENU_ACTION_ADD_TO_DESKTOP", 8, 8);
      rRk = new a("HVGAME_MENU_ACTION_COMPLAINT", 9, 9);
      rRl = new a("HVGAME_MENU_ACTION_CUSTOM", 10, 10);
      rRn = new a[] { rRb, rRc, rRd, rRe, rRf, rRg, rRh, rRi, rRj, rRk, rRl };
      rRm = new EnumMap(a.class);
      Iterator localIterator = EnumSet.allOf(a.class).iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        rRm.put(locala, Integer.valueOf(locala.code));
      }
      GMTrace.o(18083020275712L, 134729);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(18082617622528L, 134726);
      this.code = paramInt;
      GMTrace.o(18082617622528L, 134726);
    }
    
    public static boolean yi(int paramInt)
    {
      GMTrace.i(18082751840256L, 134727);
      boolean bool = rRm.containsValue(Integer.valueOf(paramInt));
      GMTrace.o(18082751840256L, 134727);
      return bool;
    }
    
    public static a yj(int paramInt)
    {
      GMTrace.i(18082886057984L, 134728);
      Object localObject = rRm.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((Integer)localEntry.getValue()).intValue() == paramInt)
        {
          localObject = (a)localEntry.getKey();
          GMTrace.o(18082886057984L, 134728);
          return (a)localObject;
        }
      }
      localObject = rRb;
      GMTrace.o(18082886057984L, 134728);
      return (a)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\menu\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */