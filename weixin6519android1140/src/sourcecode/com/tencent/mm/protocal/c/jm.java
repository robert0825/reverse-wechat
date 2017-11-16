package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jm
  extends com.tencent.mm.bm.a
{
  public String code;
  public int status;
  public int tYY;
  public int tYZ;
  public LinkedList<jz> tZa;
  public LinkedList<jz> tZb;
  public LinkedList<jz> tZc;
  public LinkedList<String> tZd;
  public int tZe;
  public int tZf;
  public LinkedList<np> tZg;
  public long tZh;
  public int tZi;
  public String tZj;
  public np tZk;
  public LinkedList<au> tZl;
  public np tZm;
  public np tZn;
  public np tZo;
  public pv tZp;
  public String tZq;
  public np tZr;
  public String tZs;
  public np tZt;
  public boolean tZu;
  
  public jm()
  {
    GMTrace.i(3619583688704L, 26968);
    this.tZa = new LinkedList();
    this.tZb = new LinkedList();
    this.tZc = new LinkedList();
    this.tZd = new LinkedList();
    this.tZg = new LinkedList();
    this.tZl = new LinkedList();
    GMTrace.o(3619583688704L, 26968);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3619717906432L, 26969);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.status);
      paramVarArgs.fk(2, this.tYY);
      paramVarArgs.fk(3, this.tYZ);
      paramVarArgs.d(4, 8, this.tZa);
      paramVarArgs.d(5, 8, this.tZb);
      paramVarArgs.d(6, 8, this.tZc);
      paramVarArgs.d(7, 1, this.tZd);
      paramVarArgs.fk(8, this.tZe);
      if (this.code != null) {
        paramVarArgs.e(9, this.code);
      }
      paramVarArgs.fk(10, this.tZf);
      paramVarArgs.d(11, 8, this.tZg);
      paramVarArgs.T(12, this.tZh);
      paramVarArgs.fk(13, this.tZi);
      if (this.tZj != null) {
        paramVarArgs.e(14, this.tZj);
      }
      if (this.tZk != null)
      {
        paramVarArgs.fm(15, this.tZk.aYq());
        this.tZk.a(paramVarArgs);
      }
      paramVarArgs.d(16, 8, this.tZl);
      if (this.tZm != null)
      {
        paramVarArgs.fm(17, this.tZm.aYq());
        this.tZm.a(paramVarArgs);
      }
      if (this.tZn != null)
      {
        paramVarArgs.fm(18, this.tZn.aYq());
        this.tZn.a(paramVarArgs);
      }
      if (this.tZo != null)
      {
        paramVarArgs.fm(19, this.tZo.aYq());
        this.tZo.a(paramVarArgs);
      }
      if (this.tZp != null)
      {
        paramVarArgs.fm(20, this.tZp.aYq());
        this.tZp.a(paramVarArgs);
      }
      if (this.tZq != null) {
        paramVarArgs.e(21, this.tZq);
      }
      if (this.tZr != null)
      {
        paramVarArgs.fm(22, this.tZr.aYq());
        this.tZr.a(paramVarArgs);
      }
      if (this.tZs != null) {
        paramVarArgs.e(23, this.tZs);
      }
      if (this.tZt != null)
      {
        paramVarArgs.fm(24, this.tZt.aYq());
        this.tZt.a(paramVarArgs);
      }
      paramVarArgs.ah(25, this.tZu);
      GMTrace.o(3619717906432L, 26969);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.status) + 0 + b.a.a.a.fh(2, this.tYY) + b.a.a.a.fh(3, this.tYZ) + b.a.a.a.c(4, 8, this.tZa) + b.a.a.a.c(5, 8, this.tZb) + b.a.a.a.c(6, 8, this.tZc) + b.a.a.a.c(7, 1, this.tZd) + b.a.a.a.fh(8, this.tZe);
      paramInt = i;
      if (this.code != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.code);
      }
      i = paramInt + b.a.a.a.fh(10, this.tZf) + b.a.a.a.c(11, 8, this.tZg) + b.a.a.a.S(12, this.tZh) + b.a.a.a.fh(13, this.tZi);
      paramInt = i;
      if (this.tZj != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tZj);
      }
      i = paramInt;
      if (this.tZk != null) {
        i = paramInt + b.a.a.a.fj(15, this.tZk.aYq());
      }
      i += b.a.a.a.c(16, 8, this.tZl);
      paramInt = i;
      if (this.tZm != null) {
        paramInt = i + b.a.a.a.fj(17, this.tZm.aYq());
      }
      i = paramInt;
      if (this.tZn != null) {
        i = paramInt + b.a.a.a.fj(18, this.tZn.aYq());
      }
      paramInt = i;
      if (this.tZo != null) {
        paramInt = i + b.a.a.a.fj(19, this.tZo.aYq());
      }
      i = paramInt;
      if (this.tZp != null) {
        i = paramInt + b.a.a.a.fj(20, this.tZp.aYq());
      }
      paramInt = i;
      if (this.tZq != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.tZq);
      }
      i = paramInt;
      if (this.tZr != null) {
        i = paramInt + b.a.a.a.fj(22, this.tZr.aYq());
      }
      paramInt = i;
      if (this.tZs != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.tZs);
      }
      i = paramInt;
      if (this.tZt != null) {
        i = paramInt + b.a.a.a.fj(24, this.tZt.aYq());
      }
      paramInt = b.a.a.b.b.a.cK(25);
      GMTrace.o(3619717906432L, 26969);
      return i + (paramInt + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tZa.clear();
      this.tZb.clear();
      this.tZc.clear();
      this.tZd.clear();
      this.tZg.clear();
      this.tZl.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3619717906432L, 26969);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jm localjm = (jm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3619717906432L, 26969);
        return -1;
      case 1: 
        localjm.status = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 2: 
        localjm.tYY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 3: 
        localjm.tYZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZa.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZc.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 7: 
        localjm.tZd.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 8: 
        localjm.tZe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 9: 
        localjm.code = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 10: 
        localjm.tZf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new np();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZg.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 12: 
        localjm.tZh = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 13: 
        localjm.tZi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 14: 
        localjm.tZj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new np();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZk = ((np)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new au();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((au)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZl.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new np();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZm = ((np)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 18: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new np();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZn = ((np)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 19: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new np();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZo = ((np)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZp = ((pv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 21: 
        localjm.tZq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new np();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZr = ((np)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 23: 
        localjm.tZs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3619717906432L, 26969);
        return 0;
      case 24: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new np();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjm.tZt = ((np)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3619717906432L, 26969);
        return 0;
      }
      localjm.tZu = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3619717906432L, 26969);
      return 0;
    }
    GMTrace.o(3619717906432L, 26969);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */