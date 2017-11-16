package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfs
  extends ayx
{
  public String tPP;
  public azp uAI;
  public int uDl;
  public LinkedList<bfc> uDr;
  public LinkedList<azq> uDw;
  public bfr uDx;
  public int uFY;
  public bjz uJw;
  public azp uQM;
  public int uQV;
  public LinkedList<azq> uQW;
  public long uQZ;
  public jj uRA;
  public int uRB;
  public LinkedList<ans> uRC;
  public bes uRD;
  public int uRa;
  public LinkedList<azq> uRb;
  public int uRc;
  public bfw uRe;
  public int uRu;
  public int uRv;
  public int uRw;
  public bfq uRx;
  public azp uRy;
  public String uRz;
  
  public bfs()
  {
    GMTrace.i(3949759299584L, 29428);
    this.uQW = new LinkedList();
    this.uDr = new LinkedList();
    this.uRb = new LinkedList();
    this.uDw = new LinkedList();
    this.uRC = new LinkedList();
    GMTrace.o(3949759299584L, 29428);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3949893517312L, 29429);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQM == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uQM != null)
      {
        paramVarArgs.fm(2, this.uQM.aYq());
        this.uQM.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uQV);
      paramVarArgs.d(4, 8, this.uQW);
      paramVarArgs.fk(5, this.uRu);
      paramVarArgs.fk(6, this.uDl);
      if (this.tPP != null) {
        paramVarArgs.e(7, this.tPP);
      }
      paramVarArgs.fk(8, this.uRv);
      paramVarArgs.fk(9, this.uFY);
      paramVarArgs.d(10, 8, this.uDr);
      paramVarArgs.fk(11, this.uRw);
      paramVarArgs.T(12, this.uQZ);
      paramVarArgs.fk(13, this.uRa);
      paramVarArgs.d(14, 8, this.uRb);
      if (this.uJw != null)
      {
        paramVarArgs.fm(15, this.uJw.aYq());
        this.uJw.a(paramVarArgs);
      }
      paramVarArgs.fk(16, this.uRc);
      paramVarArgs.d(17, 8, this.uDw);
      if (this.uRx != null)
      {
        paramVarArgs.fm(18, this.uRx.aYq());
        this.uRx.a(paramVarArgs);
      }
      if (this.uDx != null)
      {
        paramVarArgs.fm(19, this.uDx.aYq());
        this.uDx.a(paramVarArgs);
      }
      if (this.uRe != null)
      {
        paramVarArgs.fm(20, this.uRe.aYq());
        this.uRe.a(paramVarArgs);
      }
      if (this.uRy != null)
      {
        paramVarArgs.fm(21, this.uRy.aYq());
        this.uRy.a(paramVarArgs);
      }
      if (this.uRz != null) {
        paramVarArgs.e(22, this.uRz);
      }
      if (this.uRA != null)
      {
        paramVarArgs.fm(23, this.uRA.aYq());
        this.uRA.a(paramVarArgs);
      }
      paramVarArgs.fk(24, this.uRB);
      paramVarArgs.d(25, 8, this.uRC);
      if (this.uRD != null)
      {
        paramVarArgs.fm(26, this.uRD.aYq());
        this.uRD.a(paramVarArgs);
      }
      if (this.uAI != null)
      {
        paramVarArgs.fm(27, this.uAI.aYq());
        this.uAI.a(paramVarArgs);
      }
      GMTrace.o(3949893517312L, 29429);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.uQM != null) {
        i = paramInt + b.a.a.a.fj(2, this.uQM.aYq());
      }
      i = i + b.a.a.a.fh(3, this.uQV) + b.a.a.a.c(4, 8, this.uQW) + b.a.a.a.fh(5, this.uRu) + b.a.a.a.fh(6, this.uDl);
      paramInt = i;
      if (this.tPP != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tPP);
      }
      i = paramInt + b.a.a.a.fh(8, this.uRv) + b.a.a.a.fh(9, this.uFY) + b.a.a.a.c(10, 8, this.uDr) + b.a.a.a.fh(11, this.uRw) + b.a.a.a.S(12, this.uQZ) + b.a.a.a.fh(13, this.uRa) + b.a.a.a.c(14, 8, this.uRb);
      paramInt = i;
      if (this.uJw != null) {
        paramInt = i + b.a.a.a.fj(15, this.uJw.aYq());
      }
      i = paramInt + b.a.a.a.fh(16, this.uRc) + b.a.a.a.c(17, 8, this.uDw);
      paramInt = i;
      if (this.uRx != null) {
        paramInt = i + b.a.a.a.fj(18, this.uRx.aYq());
      }
      i = paramInt;
      if (this.uDx != null) {
        i = paramInt + b.a.a.a.fj(19, this.uDx.aYq());
      }
      paramInt = i;
      if (this.uRe != null) {
        paramInt = i + b.a.a.a.fj(20, this.uRe.aYq());
      }
      i = paramInt;
      if (this.uRy != null) {
        i = paramInt + b.a.a.a.fj(21, this.uRy.aYq());
      }
      paramInt = i;
      if (this.uRz != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.uRz);
      }
      i = paramInt;
      if (this.uRA != null) {
        i = paramInt + b.a.a.a.fj(23, this.uRA.aYq());
      }
      i = i + b.a.a.a.fh(24, this.uRB) + b.a.a.a.c(25, 8, this.uRC);
      paramInt = i;
      if (this.uRD != null) {
        paramInt = i + b.a.a.a.fj(26, this.uRD.aYq());
      }
      i = paramInt;
      if (this.uAI != null) {
        i = paramInt + b.a.a.a.fj(27, this.uAI.aYq());
      }
      GMTrace.o(3949893517312L, 29429);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uQW.clear();
      this.uDr.clear();
      this.uRb.clear();
      this.uDw.clear();
      this.uRC.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uQM == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      GMTrace.o(3949893517312L, 29429);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfs localbfs = (bfs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3949893517312L, 29429);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uQM = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 3: 
        localbfs.uQV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uQW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 5: 
        localbfs.uRu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 6: 
        localbfs.uDl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 7: 
        localbfs.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 8: 
        localbfs.uRv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 9: 
        localbfs.uFY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uDr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 11: 
        localbfs.uRw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 12: 
        localbfs.uQZ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 13: 
        localbfs.uRa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uRb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bjz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bjz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uJw = ((bjz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 16: 
        localbfs.uRc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uDw.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uRx = ((bfq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 19: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uDx = ((bfr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uRe = ((bfw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uRy = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 22: 
        localbfs.uRz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 23: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uRA = ((jj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 24: 
        localbfs.uRB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 25: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ans();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ans)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uRC.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      case 26: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bes();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bes)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbfs.uRD = ((bes)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949893517312L, 29429);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbfs.uAI = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3949893517312L, 29429);
      return 0;
    }
    GMTrace.o(3949893517312L, 29429);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */