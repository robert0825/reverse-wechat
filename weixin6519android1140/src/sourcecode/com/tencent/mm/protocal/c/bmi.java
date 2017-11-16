package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmi
  extends ayx
{
  public String lSX;
  public String lSY;
  public String tQN;
  public int tQP;
  public String tQb;
  public String tYF;
  public int tYG;
  public int tYH;
  public int tYI;
  public int uCA;
  public azp uCB;
  public int uCC;
  public int uCz;
  public int uOI;
  public int uVX;
  public int uVY;
  public int uVZ;
  public int uWf;
  public int uWg;
  public azp uWh;
  public int uWi;
  public int uWj;
  public String uWk;
  public int uWl;
  public String uWm;
  public String uWn;
  public int uWo;
  public String uWp;
  public String uWq;
  public String uWr;
  public String uWs;
  public String uWt;
  public String uWu;
  public String uWv;
  public String uWw;
  public int ugP;
  public int ugj;
  public String uxr;
  public String uxt;
  
  public bmi()
  {
    GMTrace.i(3839298109440L, 28605);
    GMTrace.o(3839298109440L, 28605);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3839432327168L, 28606);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uCB == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      if (this.uWh == null) {
        throw new b("Not all required fields were included: VideoData");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tQN != null) {
        paramVarArgs.e(2, this.tQN);
      }
      if (this.lSY != null) {
        paramVarArgs.e(3, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(4, this.lSX);
      }
      paramVarArgs.fk(5, this.uCz);
      paramVarArgs.fk(6, this.uCA);
      if (this.uCB != null)
      {
        paramVarArgs.fm(7, this.uCB.aYq());
        this.uCB.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.uWf);
      paramVarArgs.fk(9, this.uWg);
      if (this.uWh != null)
      {
        paramVarArgs.fm(10, this.uWh.aYq());
        this.uWh.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.uWi);
      paramVarArgs.fk(12, this.ugj);
      paramVarArgs.fk(13, this.uCC);
      paramVarArgs.fk(14, this.uWj);
      if (this.tQb != null) {
        paramVarArgs.e(15, this.tQb);
      }
      if (this.uWk != null) {
        paramVarArgs.e(16, this.uWk);
      }
      if (this.tYF != null) {
        paramVarArgs.e(17, this.tYF);
      }
      paramVarArgs.fk(18, this.tYG);
      if (this.uxr != null) {
        paramVarArgs.e(19, this.uxr);
      }
      paramVarArgs.fk(20, this.uVX);
      paramVarArgs.fk(21, this.uVY);
      paramVarArgs.fk(22, this.uVZ);
      if (this.uxt != null) {
        paramVarArgs.e(23, this.uxt);
      }
      paramVarArgs.fk(24, this.uWl);
      paramVarArgs.fk(25, this.ugP);
      if (this.uWm != null) {
        paramVarArgs.e(26, this.uWm);
      }
      if (this.uWn != null) {
        paramVarArgs.e(27, this.uWn);
      }
      paramVarArgs.fk(28, this.uWo);
      if (this.uWp != null) {
        paramVarArgs.e(29, this.uWp);
      }
      if (this.uWq != null) {
        paramVarArgs.e(30, this.uWq);
      }
      if (this.uWr != null) {
        paramVarArgs.e(31, this.uWr);
      }
      if (this.uWs != null) {
        paramVarArgs.e(32, this.uWs);
      }
      if (this.uWt != null) {
        paramVarArgs.e(33, this.uWt);
      }
      if (this.uWu != null) {
        paramVarArgs.e(34, this.uWu);
      }
      if (this.uWv != null) {
        paramVarArgs.e(35, this.uWv);
      }
      paramVarArgs.fk(36, this.uOI);
      if (this.uWw != null) {
        paramVarArgs.e(37, this.uWw);
      }
      paramVarArgs.fk(38, this.tYH);
      paramVarArgs.fk(39, this.tYI);
      paramVarArgs.fk(40, this.tQP);
      GMTrace.o(3839432327168L, 28606);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tQN);
      }
      i = paramInt;
      if (this.lSY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSY);
      }
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lSX);
      }
      i = paramInt + b.a.a.a.fh(5, this.uCz) + b.a.a.a.fh(6, this.uCA);
      paramInt = i;
      if (this.uCB != null) {
        paramInt = i + b.a.a.a.fj(7, this.uCB.aYq());
      }
      i = paramInt + b.a.a.a.fh(8, this.uWf) + b.a.a.a.fh(9, this.uWg);
      paramInt = i;
      if (this.uWh != null) {
        paramInt = i + b.a.a.a.fj(10, this.uWh.aYq());
      }
      i = paramInt + b.a.a.a.fh(11, this.uWi) + b.a.a.a.fh(12, this.ugj) + b.a.a.a.fh(13, this.uCC) + b.a.a.a.fh(14, this.uWj);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.tQb);
      }
      i = paramInt;
      if (this.uWk != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.uWk);
      }
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.tYF);
      }
      i = paramInt + b.a.a.a.fh(18, this.tYG);
      paramInt = i;
      if (this.uxr != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.uxr);
      }
      i = paramInt + b.a.a.a.fh(20, this.uVX) + b.a.a.a.fh(21, this.uVY) + b.a.a.a.fh(22, this.uVZ);
      paramInt = i;
      if (this.uxt != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.uxt);
      }
      i = paramInt + b.a.a.a.fh(24, this.uWl) + b.a.a.a.fh(25, this.ugP);
      paramInt = i;
      if (this.uWm != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.uWm);
      }
      i = paramInt;
      if (this.uWn != null) {
        i = paramInt + b.a.a.b.b.a.f(27, this.uWn);
      }
      i += b.a.a.a.fh(28, this.uWo);
      paramInt = i;
      if (this.uWp != null) {
        paramInt = i + b.a.a.b.b.a.f(29, this.uWp);
      }
      i = paramInt;
      if (this.uWq != null) {
        i = paramInt + b.a.a.b.b.a.f(30, this.uWq);
      }
      paramInt = i;
      if (this.uWr != null) {
        paramInt = i + b.a.a.b.b.a.f(31, this.uWr);
      }
      i = paramInt;
      if (this.uWs != null) {
        i = paramInt + b.a.a.b.b.a.f(32, this.uWs);
      }
      paramInt = i;
      if (this.uWt != null) {
        paramInt = i + b.a.a.b.b.a.f(33, this.uWt);
      }
      i = paramInt;
      if (this.uWu != null) {
        i = paramInt + b.a.a.b.b.a.f(34, this.uWu);
      }
      paramInt = i;
      if (this.uWv != null) {
        paramInt = i + b.a.a.b.b.a.f(35, this.uWv);
      }
      i = paramInt + b.a.a.a.fh(36, this.uOI);
      paramInt = i;
      if (this.uWw != null) {
        paramInt = i + b.a.a.b.b.a.f(37, this.uWw);
      }
      i = b.a.a.a.fh(38, this.tYH);
      int j = b.a.a.a.fh(39, this.tYI);
      int k = b.a.a.a.fh(40, this.tQP);
      GMTrace.o(3839432327168L, 28606);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uCB == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      if (this.uWh == null) {
        throw new b("Not all required fields were included: VideoData");
      }
      GMTrace.o(3839432327168L, 28606);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmi localbmi = (bmi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3839432327168L, 28606);
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
          localbmi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 2: 
        localbmi.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 3: 
        localbmi.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 4: 
        localbmi.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 5: 
        localbmi.uCz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 6: 
        localbmi.uCA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbmi.uCB = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 8: 
        localbmi.uWf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 9: 
        localbmi.uWg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbmi.uWh = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 11: 
        localbmi.uWi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 12: 
        localbmi.ugj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 13: 
        localbmi.uCC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 14: 
        localbmi.uWj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 15: 
        localbmi.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 16: 
        localbmi.uWk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 17: 
        localbmi.tYF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 18: 
        localbmi.tYG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 19: 
        localbmi.uxr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 20: 
        localbmi.uVX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 21: 
        localbmi.uVY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 22: 
        localbmi.uVZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 23: 
        localbmi.uxt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 24: 
        localbmi.uWl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 25: 
        localbmi.ugP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 26: 
        localbmi.uWm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 27: 
        localbmi.uWn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 28: 
        localbmi.uWo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 29: 
        localbmi.uWp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 30: 
        localbmi.uWq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 31: 
        localbmi.uWr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 32: 
        localbmi.uWs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 33: 
        localbmi.uWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 34: 
        localbmi.uWu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 35: 
        localbmi.uWv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 36: 
        localbmi.uOI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 37: 
        localbmi.uWw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 38: 
        localbmi.tYH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      case 39: 
        localbmi.tYI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3839432327168L, 28606);
        return 0;
      }
      localbmi.tQP = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3839432327168L, 28606);
      return 0;
    }
    GMTrace.o(3839432327168L, 28606);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */