package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.gy;
import com.tencent.mm.g.a.hk;
import com.tencent.mm.g.a.j;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.q.b;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.br;
import java.util.HashMap;
import java.util.LinkedList;

public class af
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private c gEg;
  private i gEh;
  private l gEi;
  private ac gEj;
  private ae gEk;
  private r gEl;
  private p gEm;
  private e gEn;
  private LinkedList<aly> gEo;
  private d gEp;
  private f gEq;
  private g gEr;
  private com.tencent.mm.sdk.b.c gEs;
  private com.tencent.mm.sdk.b.c gEt;
  private com.tencent.mm.sdk.b.c gEu;
  private com.tencent.mm.sdk.b.c gEv;
  private com.tencent.mm.sdk.b.c gEw;
  
  static
  {
    GMTrace.i(4415629033472L, 32899);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("ADDR_UPLOAD_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4437774958592L, 33064);
        String[] arrayOfString = c.fTX;
        GMTrace.o(4437774958592L, 33064);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("FACE_BOOK_FIREND_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4442875232256L, 33102);
        String[] arrayOfString = i.fTX;
        GMTrace.o(4442875232256L, 33102);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("FRIEND_EXT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4439519789056L, 33077);
        String[] arrayOfString = l.fTX;
        GMTrace.o(4439519789056L, 33077);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("QQ_GROUP_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4434151079936L, 33037);
        String[] arrayOfString = ac.fTX;
        GMTrace.o(4434151079936L, 33037);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("QQ_LIST_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4427977064448L, 32991);
        String[] arrayOfString = ae.fTX;
        GMTrace.o(4427977064448L, 32991);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("INVITEFRIENDOPEN_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4425695363072L, 32974);
        String[] arrayOfString = r.fTX;
        GMTrace.o(4425695363072L, 32974);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("GOOGLE_FRIEND_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(4433882644480L, 33035);
        String[] arrayOfString = p.fTX;
        GMTrace.o(4433882644480L, 33035);
        return arrayOfString;
      }
    });
    GMTrace.o(4415629033472L, 32899);
  }
  
  public af()
  {
    GMTrace.i(4413347332096L, 32882);
    this.gEn = new e();
    this.gEo = null;
    this.gEp = new d();
    this.gEq = new f();
    this.gEr = new g();
    this.gEs = new com.tencent.mm.sdk.b.c() {};
    this.gEt = new com.tencent.mm.sdk.b.c() {};
    this.gEu = new com.tencent.mm.sdk.b.c() {};
    this.gEv = new com.tencent.mm.sdk.b.c() {};
    this.gEw = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(4413347332096L, 32882);
  }
  
  private static af Ie()
  {
    GMTrace.i(4413481549824L, 32883);
    af localaf2 = (af)com.tencent.mm.y.at.AK().gZ(af.class.getName());
    af localaf1 = localaf2;
    if (localaf2 == null)
    {
      localaf1 = new af();
      com.tencent.mm.y.at.AK().a(af.class.getName(), localaf1);
    }
    GMTrace.o(4413481549824L, 32883);
    return localaf1;
  }
  
  public static c If()
  {
    GMTrace.i(4413615767552L, 32884);
    h.xw().wG();
    if (Ie().gEg == null)
    {
      localObject = Ie();
      com.tencent.mm.y.at.AR();
      ((af)localObject).gEg = new c(com.tencent.mm.y.c.yH());
    }
    Object localObject = Ie().gEg;
    GMTrace.o(4413615767552L, 32884);
    return (c)localObject;
  }
  
  public static i Ig()
  {
    GMTrace.i(4413749985280L, 32885);
    h.xw().wG();
    if (Ie().gEh == null)
    {
      localObject = Ie();
      com.tencent.mm.y.at.AR();
      ((af)localObject).gEh = new i(com.tencent.mm.y.c.yH());
    }
    Object localObject = Ie().gEh;
    GMTrace.o(4413749985280L, 32885);
    return (i)localObject;
  }
  
  public static l Ih()
  {
    GMTrace.i(4413884203008L, 32886);
    h.xw().wG();
    if (Ie().gEi == null)
    {
      localObject = Ie();
      com.tencent.mm.y.at.AR();
      ((af)localObject).gEi = new l(com.tencent.mm.y.c.yH());
    }
    Object localObject = Ie().gEi;
    GMTrace.o(4413884203008L, 32886);
    return (l)localObject;
  }
  
  public static ac Ii()
  {
    GMTrace.i(4414018420736L, 32887);
    h.xw().wG();
    if (Ie().gEj == null)
    {
      localObject = Ie();
      com.tencent.mm.y.at.AR();
      ((af)localObject).gEj = new ac(com.tencent.mm.y.c.yH());
    }
    Object localObject = Ie().gEj;
    GMTrace.o(4414018420736L, 32887);
    return (ac)localObject;
  }
  
  public static r Ij()
  {
    GMTrace.i(4414152638464L, 32888);
    h.xw().wG();
    if (Ie().gEl == null)
    {
      localObject = Ie();
      com.tencent.mm.y.at.AR();
      ((af)localObject).gEl = new r(com.tencent.mm.y.c.yH());
    }
    Object localObject = Ie().gEl;
    GMTrace.o(4414152638464L, 32888);
    return (r)localObject;
  }
  
  public static ae Ik()
  {
    GMTrace.i(4414286856192L, 32889);
    h.xw().wG();
    if (Ie().gEk == null)
    {
      localObject = Ie();
      com.tencent.mm.y.at.AR();
      ((af)localObject).gEk = new ae(com.tencent.mm.y.c.yH());
    }
    Object localObject = Ie().gEk;
    GMTrace.o(4414286856192L, 32889);
    return (ae)localObject;
  }
  
  public static LinkedList<aly> Il()
  {
    GMTrace.i(4414555291648L, 32891);
    h.xw().wG();
    LinkedList localLinkedList = Ie().gEo;
    GMTrace.o(4414555291648L, 32891);
    return localLinkedList;
  }
  
  public static void Im()
  {
    GMTrace.i(4414689509376L, 32892);
    h.xw().wG();
    Ie().gEo = null;
    GMTrace.o(4414689509376L, 32892);
  }
  
  public static p In()
  {
    GMTrace.i(4415494815744L, 32898);
    h.xw().wG();
    if (Ie().gEm == null)
    {
      localObject = Ie();
      com.tencent.mm.y.at.AR();
      ((af)localObject).gEm = new p(com.tencent.mm.y.c.yH());
    }
    Object localObject = Ie().gEm;
    GMTrace.o(4415494815744L, 32898);
    return (p)localObject;
  }
  
  public static void f(LinkedList<aly> paramLinkedList)
  {
    GMTrace.i(4414421073920L, 32890);
    h.xw().wG();
    Ie().gEo = paramLinkedList;
    GMTrace.o(4414421073920L, 32890);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4415226380288L, 32896);
    d.c.a(Integer.valueOf(42), this.gEn);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEv);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEw);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEu);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEp);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEq);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEr);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEs);
    com.tencent.mm.sdk.b.a.vgX.b(this.gEt);
    com.tencent.mm.pluginsdk.p.a.tmg = If();
    Object localObject = new com.tencent.mm.q.a();
    ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).registerIndexStorage((com.tencent.mm.plugin.fts.a.g)localObject);
    localObject = new b();
    ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).registerNativeLogic(9, (com.tencent.mm.plugin.fts.a.i)localObject);
    GMTrace.o(4415226380288L, 32896);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4415360598016L, 32897);
    GMTrace.o(4415360598016L, 32897);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4414957944832L, 32894);
    GMTrace.o(4414957944832L, 32894);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4414823727104L, 32893);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEv);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEw);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEu);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEp);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEq);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEr);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEs);
    com.tencent.mm.sdk.b.a.vgX.c(this.gEt);
    d.c.aE(Integer.valueOf(42));
    this.gEo = null;
    com.tencent.mm.pluginsdk.p.a.tmg = null;
    GMTrace.o(4414823727104L, 32893);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4415092162560L, 32895);
    HashMap localHashMap = fIv;
    GMTrace.o(4415092162560L, 32895);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */