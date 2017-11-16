package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public int jia;
  public String lPd;
  public String lPf;
  public String lPg;
  public String lPh;
  public String lPi;
  public String lPj;
  public String lPk;
  public String lPl;
  public int lPm;
  public l lPn;
  public int lPo;
  public boolean lPp;
  public LinkedList<String> lPq;
  public boolean lPr;
  public boolean lPs;
  public boolean lPt;
  public boolean lPu;
  public bn lPv;
  public int lPw;
  public bb lPx;
  
  public c()
  {
    GMTrace.i(12647470727168L, 94231);
    this.lPq = new LinkedList();
    GMTrace.o(12647470727168L, 94231);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12647604944896L, 94232);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.lPh == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      if (this.lPg != null) {
        paramVarArgs.e(1, this.lPg);
      }
      if (this.lPh != null) {
        paramVarArgs.e(2, this.lPh);
      }
      if (this.lPi != null) {
        paramVarArgs.e(3, this.lPi);
      }
      if (this.lPj != null) {
        paramVarArgs.e(4, this.lPj);
      }
      if (this.lPk != null) {
        paramVarArgs.e(5, this.lPk);
      }
      if (this.lPd != null) {
        paramVarArgs.e(6, this.lPd);
      }
      if (this.lPl != null) {
        paramVarArgs.e(7, this.lPl);
      }
      paramVarArgs.fk(8, this.lPm);
      if (this.lPn != null)
      {
        paramVarArgs.fm(9, this.lPn.aYq());
        this.lPn.a(paramVarArgs);
      }
      paramVarArgs.fk(10, this.jhA);
      paramVarArgs.fk(11, this.lPo);
      if (this.lPf != null) {
        paramVarArgs.e(12, this.lPf);
      }
      paramVarArgs.ah(13, this.lPp);
      paramVarArgs.d(14, 1, this.lPq);
      paramVarArgs.ah(15, this.lPr);
      paramVarArgs.fk(16, this.jia);
      paramVarArgs.ah(17, this.lPs);
      paramVarArgs.ah(18, this.lPt);
      paramVarArgs.ah(19, this.lPu);
      if (this.lPv != null)
      {
        paramVarArgs.fm(20, this.lPv.aYq());
        this.lPv.a(paramVarArgs);
      }
      paramVarArgs.fk(21, this.lPw);
      if (this.lPx != null)
      {
        paramVarArgs.fm(22, this.lPx.aYq());
        this.lPx.a(paramVarArgs);
      }
      GMTrace.o(12647604944896L, 94232);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lPg != null) {
        i = b.a.a.b.b.a.f(1, this.lPg) + 0;
      }
      paramInt = i;
      if (this.lPh != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPh);
      }
      i = paramInt;
      if (this.lPi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPi);
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPj);
      }
      i = paramInt;
      if (this.lPk != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPk);
      }
      paramInt = i;
      if (this.lPd != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lPd);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.lPl);
      }
      i += b.a.a.a.fh(8, this.lPm);
      paramInt = i;
      if (this.lPn != null) {
        paramInt = i + b.a.a.a.fj(9, this.lPn.aYq());
      }
      i = paramInt + b.a.a.a.fh(10, this.jhA) + b.a.a.a.fh(11, this.lPo);
      paramInt = i;
      if (this.lPf != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.lPf);
      }
      i = paramInt + (b.a.a.b.b.a.cK(13) + 1) + b.a.a.a.c(14, 1, this.lPq) + (b.a.a.b.b.a.cK(15) + 1) + b.a.a.a.fh(16, this.jia) + (b.a.a.b.b.a.cK(17) + 1) + (b.a.a.b.b.a.cK(18) + 1) + (b.a.a.b.b.a.cK(19) + 1);
      paramInt = i;
      if (this.lPv != null) {
        paramInt = i + b.a.a.a.fj(20, this.lPv.aYq());
      }
      i = paramInt + b.a.a.a.fh(21, this.lPw);
      paramInt = i;
      if (this.lPx != null) {
        paramInt = i + b.a.a.a.fj(22, this.lPx.aYq());
      }
      GMTrace.o(12647604944896L, 94232);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lPq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lPg == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.lPh == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      GMTrace.o(12647604944896L, 94232);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12647604944896L, 94232);
        return -1;
      case 1: 
        localc.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 2: 
        localc.lPh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 3: 
        localc.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 4: 
        localc.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 5: 
        localc.lPk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 6: 
        localc.lPd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 7: 
        localc.lPl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 8: 
        localc.lPm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new l();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((l)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.lPn = ((l)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 10: 
        localc.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 11: 
        localc.lPo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 12: 
        localc.lPf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 13: 
        localc.lPp = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 14: 
        localc.lPq.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 15: 
        localc.lPr = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 16: 
        localc.jia = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 17: 
        localc.lPs = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 18: 
        localc.lPt = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 19: 
        localc.lPu = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.lPv = ((bn)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647604944896L, 94232);
        return 0;
      case 21: 
        localc.lPw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12647604944896L, 94232);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localc.lPx = ((bb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12647604944896L, 94232);
      return 0;
    }
    GMTrace.o(12647604944896L, 94232);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */