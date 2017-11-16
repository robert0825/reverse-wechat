package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abi
  extends azh
{
  public String eTK;
  public String gjg;
  public String jxF;
  public String jxH;
  public String jxI;
  public String jxJ;
  public int jxM;
  public String jyT;
  public int oMU;
  public String oMV;
  public String oMW;
  public String oMX;
  public String oMZ;
  public boolean oNa;
  public String title;
  public boolean urH;
  public boolean urI;
  public String urJ;
  public String urK;
  public int urL;
  public String urM;
  public int urN;
  public String urO;
  
  public abi()
  {
    GMTrace.i(3891240370176L, 28992);
    GMTrace.o(3891240370176L, 28992);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3891374587904L, 28993);
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
      paramVarArgs.ah(2, this.urH);
      paramVarArgs.ah(3, this.urI);
      if (this.urJ != null) {
        paramVarArgs.e(4, this.urJ);
      }
      if (this.urK != null) {
        paramVarArgs.e(5, this.urK);
      }
      paramVarArgs.fk(6, this.urL);
      if (this.urM != null) {
        paramVarArgs.e(7, this.urM);
      }
      paramVarArgs.fk(8, this.urN);
      if (this.jxF != null) {
        paramVarArgs.e(9, this.jxF);
      }
      if (this.eTK != null) {
        paramVarArgs.e(10, this.eTK);
      }
      if (this.title != null) {
        paramVarArgs.e(11, this.title);
      }
      if (this.jxI != null) {
        paramVarArgs.e(12, this.jxI);
      }
      if (this.jxJ != null) {
        paramVarArgs.e(13, this.jxJ);
      }
      if (this.jyT != null) {
        paramVarArgs.e(14, this.jyT);
      }
      if (this.jxH != null) {
        paramVarArgs.e(15, this.jxH);
      }
      if (this.gjg != null) {
        paramVarArgs.e(16, this.gjg);
      }
      paramVarArgs.fk(17, this.oMU);
      if (this.oMV != null) {
        paramVarArgs.e(18, this.oMV);
      }
      if (this.oMW != null) {
        paramVarArgs.e(19, this.oMW);
      }
      if (this.oMX != null) {
        paramVarArgs.e(20, this.oMX);
      }
      paramVarArgs.fk(21, this.jxM);
      if (this.oMZ != null) {
        paramVarArgs.e(22, this.oMZ);
      }
      if (this.urO != null) {
        paramVarArgs.e(23, this.urO);
      }
      paramVarArgs.ah(24, this.oNa);
      GMTrace.o(3891374587904L, 28993);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 1) + (b.a.a.b.b.a.cK(3) + 1);
      paramInt = i;
      if (this.urJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.urJ);
      }
      i = paramInt;
      if (this.urK != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.urK);
      }
      i += b.a.a.a.fh(6, this.urL);
      paramInt = i;
      if (this.urM != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.urM);
      }
      i = paramInt + b.a.a.a.fh(8, this.urN);
      paramInt = i;
      if (this.jxF != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.jxF);
      }
      i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.eTK);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.title);
      }
      i = paramInt;
      if (this.jxI != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.jxI);
      }
      paramInt = i;
      if (this.jxJ != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.jxJ);
      }
      i = paramInt;
      if (this.jyT != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.jyT);
      }
      paramInt = i;
      if (this.jxH != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.jxH);
      }
      i = paramInt;
      if (this.gjg != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.gjg);
      }
      i += b.a.a.a.fh(17, this.oMU);
      paramInt = i;
      if (this.oMV != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.oMV);
      }
      i = paramInt;
      if (this.oMW != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.oMW);
      }
      paramInt = i;
      if (this.oMX != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.oMX);
      }
      i = paramInt + b.a.a.a.fh(21, this.jxM);
      paramInt = i;
      if (this.oMZ != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.oMZ);
      }
      i = paramInt;
      if (this.urO != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.urO);
      }
      paramInt = b.a.a.b.b.a.cK(24);
      GMTrace.o(3891374587904L, 28993);
      return i + (paramInt + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3891374587904L, 28993);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abi localabi = (abi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3891374587904L, 28993);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localabi.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 2: 
        localabi.urH = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 3: 
        localabi.urI = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 4: 
        localabi.urJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 5: 
        localabi.urK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 6: 
        localabi.urL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 7: 
        localabi.urM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 8: 
        localabi.urN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 9: 
        localabi.jxF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 10: 
        localabi.eTK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 11: 
        localabi.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 12: 
        localabi.jxI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 13: 
        localabi.jxJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 14: 
        localabi.jyT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 15: 
        localabi.jxH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 16: 
        localabi.gjg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 17: 
        localabi.oMU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 18: 
        localabi.oMV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 19: 
        localabi.oMW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 20: 
        localabi.oMX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 21: 
        localabi.jxM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 22: 
        localabi.oMZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      case 23: 
        localabi.urO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3891374587904L, 28993);
        return 0;
      }
      localabi.oNa = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3891374587904L, 28993);
      return 0;
    }
    GMTrace.o(3891374587904L, 28993);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\abi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */