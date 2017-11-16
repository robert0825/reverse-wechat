package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpl
  extends azh
{
  public int tSN;
  public LinkedList<boe> tSO;
  public int uKq;
  public bpm uXY;
  public int uXZ;
  public int uYa;
  public int uYb;
  public int uYc;
  public int uYh;
  public LinkedList<bpn> uYi;
  public int uYj;
  public int uYk;
  public int uYl;
  public int uYm;
  public int uYn;
  public int uYo;
  public int uYp;
  public int uYq;
  public int uYr;
  public int uYs;
  public int uYt;
  public int uYu;
  public int uYv;
  public int uZe;
  public int uZf;
  public int uZg;
  public int uhU;
  public long uhV;
  
  public bpl()
  {
    GMTrace.i(3830842392576L, 28542);
    this.tSO = new LinkedList();
    this.uYi = new LinkedList();
    GMTrace.o(3830842392576L, 28542);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3830976610304L, 28543);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.fk(3, this.tSN);
      paramVarArgs.d(4, 8, this.tSO);
      paramVarArgs.T(5, this.uhV);
      paramVarArgs.fk(6, this.uKq);
      if (this.uXY != null)
      {
        paramVarArgs.fm(7, this.uXY.aYq());
        this.uXY.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.uYh);
      paramVarArgs.d(9, 8, this.uYi);
      paramVarArgs.fk(10, this.uYj);
      paramVarArgs.fk(11, this.uYk);
      paramVarArgs.fk(12, this.uYl);
      paramVarArgs.fk(13, this.uYm);
      paramVarArgs.fk(14, this.uZe);
      paramVarArgs.fk(15, this.uYn);
      paramVarArgs.fk(16, this.uYo);
      paramVarArgs.fk(17, this.uXZ);
      paramVarArgs.fk(18, this.uYp);
      paramVarArgs.fk(19, this.uYq);
      paramVarArgs.fk(20, this.uYa);
      paramVarArgs.fk(21, this.uYr);
      paramVarArgs.fk(22, this.uYs);
      paramVarArgs.fk(23, this.uYt);
      paramVarArgs.fk(24, this.uZf);
      paramVarArgs.fk(25, this.uYu);
      paramVarArgs.fk(26, this.uZg);
      paramVarArgs.fk(27, this.uYb);
      paramVarArgs.fk(28, this.uYc);
      paramVarArgs.fk(29, this.uYv);
      GMTrace.o(3830976610304L, 28543);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.fh(3, this.tSN) + b.a.a.a.c(4, 8, this.tSO) + b.a.a.a.S(5, this.uhV) + b.a.a.a.fh(6, this.uKq);
      paramInt = i;
      if (this.uXY != null) {
        paramInt = i + b.a.a.a.fj(7, this.uXY.aYq());
      }
      i = b.a.a.a.fh(8, this.uYh);
      int j = b.a.a.a.c(9, 8, this.uYi);
      int k = b.a.a.a.fh(10, this.uYj);
      int m = b.a.a.a.fh(11, this.uYk);
      int n = b.a.a.a.fh(12, this.uYl);
      int i1 = b.a.a.a.fh(13, this.uYm);
      int i2 = b.a.a.a.fh(14, this.uZe);
      int i3 = b.a.a.a.fh(15, this.uYn);
      int i4 = b.a.a.a.fh(16, this.uYo);
      int i5 = b.a.a.a.fh(17, this.uXZ);
      int i6 = b.a.a.a.fh(18, this.uYp);
      int i7 = b.a.a.a.fh(19, this.uYq);
      int i8 = b.a.a.a.fh(20, this.uYa);
      int i9 = b.a.a.a.fh(21, this.uYr);
      int i10 = b.a.a.a.fh(22, this.uYs);
      int i11 = b.a.a.a.fh(23, this.uYt);
      int i12 = b.a.a.a.fh(24, this.uZf);
      int i13 = b.a.a.a.fh(25, this.uYu);
      int i14 = b.a.a.a.fh(26, this.uZg);
      int i15 = b.a.a.a.fh(27, this.uYb);
      int i16 = b.a.a.a.fh(28, this.uYc);
      int i17 = b.a.a.a.fh(29, this.uYv);
      GMTrace.o(3830976610304L, 28543);
      return paramInt + i + j + k + m + n + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSO.clear();
      this.uYi.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3830976610304L, 28543);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpl localbpl = (bpl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3830976610304L, 28543);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbpl.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 2: 
        localbpl.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 3: 
        localbpl.tSN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbpl.tSO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 5: 
        localbpl.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 6: 
        localbpl.uKq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbpl.uXY = ((bpm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 8: 
        localbpl.uYh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbpl.uYi.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 10: 
        localbpl.uYj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 11: 
        localbpl.uYk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 12: 
        localbpl.uYl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 13: 
        localbpl.uYm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 14: 
        localbpl.uZe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 15: 
        localbpl.uYn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 16: 
        localbpl.uYo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 17: 
        localbpl.uXZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 18: 
        localbpl.uYp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 19: 
        localbpl.uYq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 20: 
        localbpl.uYa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 21: 
        localbpl.uYr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 22: 
        localbpl.uYs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 23: 
        localbpl.uYt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 24: 
        localbpl.uZf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 25: 
        localbpl.uYu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 26: 
        localbpl.uZg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 27: 
        localbpl.uYb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      case 28: 
        localbpl.uYc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3830976610304L, 28543);
        return 0;
      }
      localbpl.uYv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3830976610304L, 28543);
      return 0;
    }
    GMTrace.o(3830976610304L, 28543);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */