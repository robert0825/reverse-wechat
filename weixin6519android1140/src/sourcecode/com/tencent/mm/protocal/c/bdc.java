package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdc
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
  public int jzr;
  public int oMR;
  public int oMU;
  public String oMV;
  public String oMW;
  public String oMX;
  public String oMY;
  public String oMZ;
  public boolean oNa;
  public String title;
  
  public bdc()
  {
    GMTrace.i(3841445593088L, 28621);
    GMTrace.o(3841445593088L, 28621);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3841579810816L, 28622);
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
      paramVarArgs.fk(2, this.jzr);
      if (this.jxF != null) {
        paramVarArgs.e(3, this.jxF);
      }
      if (this.eTK != null) {
        paramVarArgs.e(4, this.eTK);
      }
      if (this.title != null) {
        paramVarArgs.e(5, this.title);
      }
      if (this.jxI != null) {
        paramVarArgs.e(6, this.jxI);
      }
      if (this.jxJ != null) {
        paramVarArgs.e(7, this.jxJ);
      }
      if (this.jyT != null) {
        paramVarArgs.e(8, this.jyT);
      }
      if (this.jxH != null) {
        paramVarArgs.e(9, this.jxH);
      }
      if (this.gjg != null) {
        paramVarArgs.e(10, this.gjg);
      }
      paramVarArgs.fk(11, this.oMR);
      paramVarArgs.fk(12, this.oMU);
      if (this.oMV != null) {
        paramVarArgs.e(13, this.oMV);
      }
      if (this.oMW != null) {
        paramVarArgs.e(14, this.oMW);
      }
      if (this.oMX != null) {
        paramVarArgs.e(19, this.oMX);
      }
      if (this.oMY != null) {
        paramVarArgs.e(21, this.oMY);
      }
      paramVarArgs.fk(22, this.jxM);
      if (this.oMZ != null) {
        paramVarArgs.e(23, this.oMZ);
      }
      paramVarArgs.ah(24, this.oNa);
      GMTrace.o(3841579810816L, 28622);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzr);
      paramInt = i;
      if (this.jxF != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jxF);
      }
      i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.eTK);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.title);
      }
      i = paramInt;
      if (this.jxI != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.jxI);
      }
      paramInt = i;
      if (this.jxJ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.jxJ);
      }
      i = paramInt;
      if (this.jyT != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.jyT);
      }
      paramInt = i;
      if (this.jxH != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.jxH);
      }
      i = paramInt;
      if (this.gjg != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.gjg);
      }
      i = i + b.a.a.a.fh(11, this.oMR) + b.a.a.a.fh(12, this.oMU);
      paramInt = i;
      if (this.oMV != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.oMV);
      }
      i = paramInt;
      if (this.oMW != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.oMW);
      }
      paramInt = i;
      if (this.oMX != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.oMX);
      }
      i = paramInt;
      if (this.oMY != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.oMY);
      }
      i += b.a.a.a.fh(22, this.jxM);
      paramInt = i;
      if (this.oMZ != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.oMZ);
      }
      i = b.a.a.b.b.a.cK(24);
      GMTrace.o(3841579810816L, 28622);
      return paramInt + (i + 1);
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
      GMTrace.o(3841579810816L, 28622);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdc localbdc = (bdc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 20: 
      default: 
        GMTrace.o(3841579810816L, 28622);
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
          localbdc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 2: 
        localbdc.jzr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 3: 
        localbdc.jxF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 4: 
        localbdc.eTK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 5: 
        localbdc.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 6: 
        localbdc.jxI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 7: 
        localbdc.jxJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 8: 
        localbdc.jyT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 9: 
        localbdc.jxH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 10: 
        localbdc.gjg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 11: 
        localbdc.oMR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 12: 
        localbdc.oMU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 13: 
        localbdc.oMV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 14: 
        localbdc.oMW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 19: 
        localbdc.oMX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 21: 
        localbdc.oMY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 22: 
        localbdc.jxM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      case 23: 
        localbdc.oMZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3841579810816L, 28622);
        return 0;
      }
      localbdc.oNa = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3841579810816L, 28622);
      return 0;
    }
    GMTrace.o(3841579810816L, 28622);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */