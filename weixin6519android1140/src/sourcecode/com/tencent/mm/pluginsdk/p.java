package com.tencent.mm.pluginsdk;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.as.b;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.c.c;
import com.tencent.mm.protocal.c.aei;
import com.tencent.mm.protocal.c.bir;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

@Deprecated
public abstract interface p
{
  public static final class a
  {
    public static p.m tlV;
    public static p.n tlW;
    public static p.e tlX;
    public static p.i tlY;
    public static p.c tlZ;
    public static p.j tma;
    public static p.p tmb;
    public static p.r tmc;
    public static p.g tmd;
    public static p.v tme;
    public static p.h tmf;
    public static p.b tmg;
    
    public static p.i bIQ()
    {
      GMTrace.i(1234266226688L, 9196);
      if (tlY == null)
      {
        w.w("MicroMsg.IPluginEvent.Factory", "get shake mgr is null, new default");
        tlY = new c();
      }
      p.i locali = tlY;
      GMTrace.o(1234266226688L, 9196);
      return locali;
    }
    
    public static p.j bIR()
    {
      GMTrace.i(1234534662144L, 9198);
      p.j localj = tma;
      GMTrace.o(1234534662144L, 9198);
      return localj;
    }
  }
  
  public static final class aa
  {
    public static p.w.a tmk;
  }
  
  public static abstract interface b
  {
    public abstract String jM(String paramString);
    
    public abstract String jN(String paramString);
  }
  
  public static abstract interface c
  {
    public abstract boolean ajW();
    
    public abstract boolean ajX();
    
    public abstract String ajY();
    
    public abstract int ajZ();
    
    public abstract boolean lE(int paramInt);
  }
  
  public static abstract interface d
  {
    public abstract boolean aCe();
    
    public abstract boolean brk();
    
    public abstract String brm();
    
    public abstract String brn();
    
    public abstract boolean bro();
    
    public abstract String brp();
    
    public abstract String brq();
  }
  
  public static abstract interface e
  {
    public abstract void a(Context paramContext, boolean paramBoolean);
    
    public abstract void am(Context paramContext);
    
    public abstract boolean pG();
  }
  
  public static abstract interface f
  {
    public abstract void Ob(String paramString);
  }
  
  public static abstract interface g
  {
    public abstract void CR(String paramString);
    
    public abstract boolean CS(String paramString);
    
    public abstract boolean CT(String paramString);
    
    public abstract List<String> CU(String paramString);
    
    public abstract boolean CV(String paramString);
    
    public abstract boolean CW(String paramString);
    
    public abstract void CX(String paramString);
    
    public abstract boolean CY(String paramString);
    
    public abstract boolean CZ(String paramString);
    
    public abstract void Da(String paramString);
    
    public abstract b De(String paramString);
    
    public abstract void a(p.f paramf);
    
    public abstract boolean aR(Context paramContext);
    
    public abstract boolean aRE();
    
    public abstract boolean aRF();
    
    public abstract boolean aRq();
    
    public abstract boolean aRs();
    
    public abstract void b(p.f paramf);
    
    public abstract boolean cX(String paramString1, String paramString2);
    
    public abstract String cY(String paramString1, String paramString2);
    
    public abstract int cZ(String paramString1, String paramString2);
    
    public abstract String fs(String paramString);
    
    public abstract boolean hB(String paramString);
  }
  
  public static abstract interface h
  {
    public abstract boolean a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener);
    
    public abstract boolean bP(String paramString);
    
    public abstract String p(Context paramContext, String paramString);
  }
  
  public static abstract interface i
  {
    public abstract String Go(String paramString);
    
    public abstract int bfd();
    
    public abstract void bfe();
    
    public abstract boolean bff();
    
    public abstract void bfg();
    
    public abstract void bfh();
    
    public abstract boolean bfi();
  }
  
  public static abstract interface j
  {
    public abstract void G(String paramString, int paramInt1, int paramInt2);
    
    public abstract void L(String paramString1, String paramString2, String paramString3);
    
    public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, long paramLong, String paramString5);
    
    public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2);
    
    public abstract void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3);
    
    public abstract void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, long paramLong);
    
    public abstract boolean aGm();
    
    public abstract void cC(Context paramContext);
    
    public abstract void o(Context paramContext, String paramString1, String paramString2);
  }
  
  public static abstract interface k
  {
    public abstract String brA();
    
    public abstract p.d brB();
    
    public abstract boolean brs();
    
    public abstract boolean brt();
    
    public abstract void bru();
    
    public abstract void brv();
    
    public abstract void bry();
  }
  
  public static abstract interface l
  {
    public abstract void E(String paramString1, String paramString2, String paramString3);
  }
  
  public static abstract interface m
  {
    public abstract boolean JD(String paramString);
    
    public abstract LinkedList<bir> JE(String paramString);
    
    public abstract void a(p.l paraml);
    
    public abstract void a(String paramString1, LinkedList<bir> paramLinkedList, String paramString2, String paramString3, int paramInt);
    
    public abstract void b(p.l paraml);
    
    public abstract boolean bsm();
  }
  
  public static abstract interface n
  {
    public abstract void a(p.o paramo);
    
    public abstract void b(p.o paramo);
    
    public abstract void bX(String paramString, int paramInt);
    
    public abstract boolean bsA();
    
    public abstract void bsb();
    
    public abstract boolean bss();
    
    public abstract void bst();
    
    public abstract short bsy();
    
    public abstract short bsz();
  }
  
  public static abstract interface o
  {
    public abstract void Bt(String paramString);
    
    public abstract void H(String paramString, int paramInt1, int paramInt2);
    
    public abstract void aKX();
    
    public abstract void aKY();
    
    public abstract void aKZ();
    
    public abstract void aLa();
    
    public abstract void aLb();
    
    public abstract void aLc();
    
    public abstract void cN(String paramString1, String paramString2);
    
    public abstract void l(int paramInt1, int paramInt2, String paramString);
    
    public abstract void pJ(int paramInt);
  }
  
  public static abstract interface p
  {
    public abstract String aKu();
  }
  
  public static abstract interface q
  {
    public abstract void Oc(String paramString);
  }
  
  public static abstract interface r
  {
    public abstract LinkedList<String> Bh(String paramString);
    
    public abstract boolean Bj(String paramString);
    
    public abstract void a(p.q paramq);
    
    public abstract void a(String paramString1, LinkedList<String> paramLinkedList, double paramDouble1, double paramDouble2, String paramString2, String paramString3, String paramString4);
    
    public abstract boolean aKD();
    
    public abstract String aKE();
    
    public abstract void b(p.q paramq);
    
    public abstract boolean cM(String paramString1, String paramString2);
  }
  
  public static abstract interface s
  {
    public abstract void update(int paramInt);
  }
  
  public static abstract interface t
  {
    public abstract int bIS();
    
    public abstract String[] bIT();
    
    public abstract aei bIU();
  }
  
  public static abstract interface u
  {
    public abstract String FM(String paramString);
    
    public abstract p.s a(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener);
    
    public abstract p.s b(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener);
    
    public abstract void bcj();
    
    public abstract p.t bck();
    
    public abstract void d(String paramString1, int paramInt, String paramString2, String paramString3);
    
    public abstract p.s db(Context paramContext);
    
    public abstract void dc(Context paramContext);
    
    public abstract void gY(boolean paramBoolean);
    
    public abstract void r(Context paramContext, Intent paramIntent);
    
    public abstract void s(Context paramContext, Intent paramIntent);
  }
  
  public static abstract interface v
  {
    public abstract boolean a(Context paramContext, String paramString, boolean paramBoolean);
    
    public abstract boolean a(Context paramContext, String paramString, boolean paramBoolean, Bundle paramBundle);
    
    public abstract boolean a(Context paramContext, String paramString, boolean paramBoolean, t paramt);
    
    public abstract boolean b(Context paramContext, String paramString, boolean paramBoolean, t paramt);
    
    public abstract boolean b(Context paramContext, String paramString, Object... paramVarArgs);
  }
  
  public static abstract interface w
  {
    public static abstract interface a
    {
      public abstract String bBo();
      
      public abstract void bBp();
      
      public abstract boolean bBq();
    }
  }
  
  public static final class x
  {
    private static p.u tmh;
    public static boolean tmi;
    
    static
    {
      GMTrace.i(707461644288L, 5271);
      tmi = false;
      GMTrace.o(707461644288L, 5271);
    }
    
    public static void a(p.u paramu)
    {
      GMTrace.i(707193208832L, 5269);
      tmh = paramu;
      GMTrace.o(707193208832L, 5269);
    }
    
    public static p.u bIV()
    {
      GMTrace.i(707327426560L, 5270);
      p.u localu = tmh;
      GMTrace.o(707327426560L, 5270);
      return localu;
    }
  }
  
  public static final class y
  {
    public static g bIW()
    {
      GMTrace.i(17950010507264L, 133738);
      g localg = n.poU;
      GMTrace.o(17950010507264L, 133738);
      return localg;
    }
  }
  
  public static final class z
  {
    public static p.k tmj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */