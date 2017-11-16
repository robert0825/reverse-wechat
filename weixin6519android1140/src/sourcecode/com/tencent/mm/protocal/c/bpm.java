package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpm
  extends com.tencent.mm.bm.a
{
  public int mkb;
  public bpr uXS;
  public bpr uXT;
  public azp uZA;
  public int uZB;
  public int uZC;
  public int uZD;
  public akb uZE;
  public int uZh;
  public bof uZi;
  public bof uZj;
  public int uZk;
  public int uZl;
  public int uZm;
  public int uZn;
  public azp uZo;
  public int uZp;
  public bof uZq;
  public int uZr;
  public int uZs;
  public int uZt;
  public int uZu;
  public int uZv;
  public int uZw;
  public azp uZx;
  public azp uZy;
  public int uZz;
  
  public bpm()
  {
    GMTrace.i(3708570042368L, 27631);
    GMTrace.o(3708570042368L, 27631);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3708704260096L, 27632);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uXS == null) {
        throw new b("Not all required fields were included: PeerId");
      }
      if (this.uXT == null) {
        throw new b("Not all required fields were included: CapInfo");
      }
      if (this.uXS != null)
      {
        paramVarArgs.fm(1, this.uXS.aYq());
        this.uXS.a(paramVarArgs);
      }
      if (this.uXT != null)
      {
        paramVarArgs.fm(2, this.uXT.aYq());
        this.uXT.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uZh);
      if (this.uZi != null)
      {
        paramVarArgs.fm(4, this.uZi.aYq());
        this.uZi.a(paramVarArgs);
      }
      if (this.uZj != null)
      {
        paramVarArgs.fm(5, this.uZj.aYq());
        this.uZj.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.uZk);
      paramVarArgs.fk(7, this.uZl);
      paramVarArgs.fk(8, this.uZm);
      paramVarArgs.fk(9, this.uZn);
      if (this.uZo != null)
      {
        paramVarArgs.fm(10, this.uZo.aYq());
        this.uZo.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.uZp);
      if (this.uZq != null)
      {
        paramVarArgs.fm(12, this.uZq.aYq());
        this.uZq.a(paramVarArgs);
      }
      paramVarArgs.fk(13, this.uZr);
      paramVarArgs.fk(14, this.uZs);
      paramVarArgs.fk(15, this.uZt);
      paramVarArgs.fk(16, this.uZu);
      paramVarArgs.fk(17, this.uZv);
      paramVarArgs.fk(18, this.mkb);
      paramVarArgs.fk(19, this.uZw);
      if (this.uZx != null)
      {
        paramVarArgs.fm(20, this.uZx.aYq());
        this.uZx.a(paramVarArgs);
      }
      if (this.uZy != null)
      {
        paramVarArgs.fm(21, this.uZy.aYq());
        this.uZy.a(paramVarArgs);
      }
      paramVarArgs.fk(22, this.uZz);
      if (this.uZA != null)
      {
        paramVarArgs.fm(23, this.uZA.aYq());
        this.uZA.a(paramVarArgs);
      }
      paramVarArgs.fk(24, this.uZB);
      paramVarArgs.fk(25, this.uZC);
      paramVarArgs.fk(26, this.uZD);
      if (this.uZE != null)
      {
        paramVarArgs.fm(27, this.uZE.aYq());
        this.uZE.a(paramVarArgs);
      }
      GMTrace.o(3708704260096L, 27632);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uXS != null) {
        paramInt = b.a.a.a.fj(1, this.uXS.aYq()) + 0;
      }
      i = paramInt;
      if (this.uXT != null) {
        i = paramInt + b.a.a.a.fj(2, this.uXT.aYq());
      }
      i += b.a.a.a.fh(3, this.uZh);
      paramInt = i;
      if (this.uZi != null) {
        paramInt = i + b.a.a.a.fj(4, this.uZi.aYq());
      }
      i = paramInt;
      if (this.uZj != null) {
        i = paramInt + b.a.a.a.fj(5, this.uZj.aYq());
      }
      i = i + b.a.a.a.fh(6, this.uZk) + b.a.a.a.fh(7, this.uZl) + b.a.a.a.fh(8, this.uZm) + b.a.a.a.fh(9, this.uZn);
      paramInt = i;
      if (this.uZo != null) {
        paramInt = i + b.a.a.a.fj(10, this.uZo.aYq());
      }
      i = paramInt + b.a.a.a.fh(11, this.uZp);
      paramInt = i;
      if (this.uZq != null) {
        paramInt = i + b.a.a.a.fj(12, this.uZq.aYq());
      }
      i = paramInt + b.a.a.a.fh(13, this.uZr) + b.a.a.a.fh(14, this.uZs) + b.a.a.a.fh(15, this.uZt) + b.a.a.a.fh(16, this.uZu) + b.a.a.a.fh(17, this.uZv) + b.a.a.a.fh(18, this.mkb) + b.a.a.a.fh(19, this.uZw);
      paramInt = i;
      if (this.uZx != null) {
        paramInt = i + b.a.a.a.fj(20, this.uZx.aYq());
      }
      i = paramInt;
      if (this.uZy != null) {
        i = paramInt + b.a.a.a.fj(21, this.uZy.aYq());
      }
      i += b.a.a.a.fh(22, this.uZz);
      paramInt = i;
      if (this.uZA != null) {
        paramInt = i + b.a.a.a.fj(23, this.uZA.aYq());
      }
      i = paramInt + b.a.a.a.fh(24, this.uZB) + b.a.a.a.fh(25, this.uZC) + b.a.a.a.fh(26, this.uZD);
      paramInt = i;
      if (this.uZE != null) {
        paramInt = i + b.a.a.a.fj(27, this.uZE.aYq());
      }
      GMTrace.o(3708704260096L, 27632);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uXS == null) {
        throw new b("Not all required fields were included: PeerId");
      }
      if (this.uXT == null) {
        throw new b("Not all required fields were included: CapInfo");
      }
      GMTrace.o(3708704260096L, 27632);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpm localbpm = (bpm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3708704260096L, 27632);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uXS = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uXT = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 3: 
        localbpm.uZh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bof();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bof)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uZi = ((bof)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bof();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bof)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uZj = ((bof)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 6: 
        localbpm.uZk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 7: 
        localbpm.uZl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 8: 
        localbpm.uZm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 9: 
        localbpm.uZn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uZo = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 11: 
        localbpm.uZp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bof();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bof)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uZq = ((bof)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 13: 
        localbpm.uZr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 14: 
        localbpm.uZs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 15: 
        localbpm.uZt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 16: 
        localbpm.uZu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 17: 
        localbpm.uZv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 18: 
        localbpm.mkb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 19: 
        localbpm.uZw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uZx = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 21: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uZy = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 22: 
        localbpm.uZz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 23: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpm.uZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 24: 
        localbpm.uZB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 25: 
        localbpm.uZC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      case 26: 
        localbpm.uZD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3708704260096L, 27632);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new akb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((akb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbpm.uZE = ((akb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3708704260096L, 27632);
      return 0;
    }
    GMTrace.o(3708704260096L, 27632);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */