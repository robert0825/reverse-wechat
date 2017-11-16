package com.tencent.mm.plugin.location.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.Set;

public final class a
{
  public static final class a
  {
    Set<Long> mwN;
    private b.a mwO;
    
    public a()
    {
      GMTrace.i(9623947968512L, 71704);
      this.mwO = new b.a()
      {
        public final void b(Addr paramAnonymousAddr)
        {
          GMTrace.i(9637503959040L, 71805);
          a.a locala = a.a.this;
          au localau;
          int i;
          boolean bool;
          Object localObject;
          if ((paramAnonymousAddr.tag != null) && ((paramAnonymousAddr.tag instanceof Long)))
          {
            long l = ((Long)paramAnonymousAddr.tag).longValue();
            at.AR();
            localau = com.tencent.mm.y.c.yM().cM(l);
            if (!bg.nm(paramAnonymousAddr.gEy))
            {
              String str = localau.field_content;
              if (localau.field_isSend != 0) {
                break label574;
              }
              i = 1;
              bool = s.eb(localau.field_talker);
              localObject = str;
              if (bool)
              {
                localObject = str;
                if (i != 0)
                {
                  int j = bc.gO(str);
                  localObject = str;
                  if (j != -1) {
                    localObject = str.substring(j + 1).trim();
                  }
                }
              }
              localObject = au.b.Ui((String)localObject);
              ((au.b)localObject).label = paramAnonymousAddr.Io();
              if ((!bool) || (i == 0)) {
                break label585;
              }
              i = bc.gO(localau.field_content);
              if (i == -1) {
                break label585;
              }
              paramAnonymousAddr = localau.field_content.substring(0, i).trim();
              if (paramAnonymousAddr.length() <= 0) {
                break label585;
              }
            }
          }
          for (;;)
          {
            if ((((au.b)localObject).vBA == null) || (((au.b)localObject).vBA.equals(""))) {
              ((au.b)localObject).vBA = "";
            }
            if ((((au.b)localObject).vBz == null) || (((au.b)localObject).vBz.equals(""))) {
              ((au.b)localObject).vBA = "";
            }
            if ((((au.b)localObject).vBy == null) || (((au.b)localObject).vBy.equals(""))) {
              ((au.b)localObject).vBy = "";
            }
            if ((((au.b)localObject).rAP == null) || (((au.b)localObject).rAP.equals(""))) {
              ((au.b)localObject).rAP = "";
            }
            if ((((au.b)localObject).label == null) || (((au.b)localObject).label.equals(""))) {
              ((au.b)localObject).label = "";
            }
            if ((((au.b)localObject).vBx == null) || (((au.b)localObject).vBx.equals(""))) {
              ((au.b)localObject).vBx = "";
            }
            localObject = "<msg><location x=\"" + ((au.b)localObject).mwH + "\" y=\"" + ((au.b)localObject).mwI + "\" scale=\"" + ((au.b)localObject).eMn + "\" label=\"" + ((au.b)localObject).label + "\" maptype=\"" + ((au.b)localObject).vBx + "\"  fromusername=\"" + ((au.b)localObject).rAP + "\" /></msg>";
            if ((bool) && (!paramAnonymousAddr.equals(""))) {}
            for (paramAnonymousAddr = paramAnonymousAddr + ":\n" + (String)localObject;; paramAnonymousAddr = (Addr)localObject)
            {
              w.d("MicroMsg.LocationServer", "xml: " + paramAnonymousAddr);
              localau.setContent(paramAnonymousAddr);
              at.AR();
              com.tencent.mm.y.c.yM().a(localau.field_msgId, localau);
              locala.mwN.remove(Long.valueOf(localau.field_msgId));
              GMTrace.o(9637503959040L, 71805);
              return;
              label574:
              i = 0;
              break;
            }
            label585:
            paramAnonymousAddr = "";
          }
        }
      };
      GMTrace.o(9623947968512L, 71704);
    }
    
    public final String[] M(au paramau)
    {
      int j = 1;
      GMTrace.i(9624216403968L, 71706);
      String[] arrayOfString = new String[2];
      Object localObject1 = paramau.field_content;
      if (bg.nm((String)localObject1))
      {
        arrayOfString[0] = "";
        arrayOfString[1] = "";
        GMTrace.o(9624216403968L, 71706);
        return arrayOfString;
      }
      int i;
      if (paramau.field_isSend == 0)
      {
        i = 1;
        if ((!s.eb(paramau.field_talker)) || (i == 0)) {
          break label385;
        }
        i = bc.gO((String)localObject1);
        if (i == -1) {
          break label385;
        }
        localObject1 = ((String)localObject1).substring(i + 1).trim();
      }
      label139:
      label169:
      label362:
      label380:
      label385:
      for (;;)
      {
        at.AR();
        Object localObject2 = com.tencent.mm.y.c.yM().Co((String)localObject1);
        long l;
        if ((((au.b)localObject2).mzo == null) || (((au.b)localObject2).mzo.equals("")))
        {
          i = 0;
          if (i == 0) {
            break label362;
          }
          localObject1 = ((au.b)localObject2).label;
          localObject2 = ((au.b)localObject2).mzo;
          arrayOfString[0] = localObject1;
          arrayOfString[1] = localObject2;
          if ((bg.nm(arrayOfString[0])) && (bg.nm(arrayOfString[1])))
          {
            w.i("MicroMsg.LocationServer", "pull from sever");
            l = paramau.field_msgId;
            if ((this.mwN != null) && (!this.mwN.contains(Long.valueOf(l))))
            {
              localObject2 = paramau.field_content;
              if (paramau.field_isSend != 0) {
                break label380;
              }
            }
          }
        }
        for (i = j;; i = 0)
        {
          localObject1 = localObject2;
          if (s.eb(paramau.field_talker))
          {
            localObject1 = localObject2;
            if (i != 0)
            {
              i = bc.gO((String)localObject2);
              localObject1 = localObject2;
              if (i != -1) {
                localObject1 = ((String)localObject2).substring(i + 1).trim();
              }
            }
          }
          localObject1 = au.b.Ui((String)localObject1);
          this.mwN.add(Long.valueOf(l));
          b.Ip().a(((au.b)localObject1).mwH, ((au.b)localObject1).mwI, this.mwO, Long.valueOf(paramau.field_msgId));
          GMTrace.o(9624216403968L, 71706);
          return arrayOfString;
          i = 0;
          break;
          i = 1;
          break label139;
          arrayOfString[0] = ((au.b)localObject2).label;
          arrayOfString[1] = "";
          break label169;
        }
      }
    }
    
    public final void aKf()
    {
      GMTrace.i(9624082186240L, 71705);
      if (this.mwN != null) {
        this.mwN.clear();
      }
      b.Ip().a(this.mwO);
      GMTrace.o(9624082186240L, 71705);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */