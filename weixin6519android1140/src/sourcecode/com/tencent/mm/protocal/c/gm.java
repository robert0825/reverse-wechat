package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gm
  extends azh
{
  public String eEU;
  public int tOy;
  public String tRz;
  public bdz tSl;
  public String tSm;
  public int tSq;
  public int tUN;
  public String tUO;
  public String tUP;
  public int tUQ;
  public String tUR;
  public aho tUS;
  public hz tUT;
  public apx tUU;
  public String tUV;
  public int tUW;
  public azt tUX;
  public String tUY;
  public String tUZ;
  public String tVa;
  public String tVb;
  
  public gm()
  {
    GMTrace.i(13170919866368L, 98131);
    GMTrace.o(13170919866368L, 98131);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13171054084096L, 98132);
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
      if (this.eEU != null) {
        paramVarArgs.e(2, this.eEU);
      }
      if (this.tUP != null) {
        paramVarArgs.e(3, this.tUP);
      }
      paramVarArgs.fk(4, this.tUQ);
      if (this.tUR != null) {
        paramVarArgs.e(5, this.tUR);
      }
      if (this.tRz != null) {
        paramVarArgs.e(6, this.tRz);
      }
      if (this.tUS != null)
      {
        paramVarArgs.fm(7, this.tUS.aYq());
        this.tUS.a(paramVarArgs);
      }
      if (this.tUT != null)
      {
        paramVarArgs.fm(8, this.tUT.aYq());
        this.tUT.a(paramVarArgs);
      }
      if (this.tUU != null)
      {
        paramVarArgs.fm(9, this.tUU.aYq());
        this.tUU.a(paramVarArgs);
      }
      if (this.tSm != null) {
        paramVarArgs.e(10, this.tSm);
      }
      paramVarArgs.fk(11, this.tOy);
      if (this.tUV != null) {
        paramVarArgs.e(12, this.tUV);
      }
      paramVarArgs.fk(13, this.tUW);
      if (this.tUX != null)
      {
        paramVarArgs.fm(14, this.tUX.aYq());
        this.tUX.a(paramVarArgs);
      }
      if (this.tUY != null) {
        paramVarArgs.e(15, this.tUY);
      }
      if (this.tUZ != null) {
        paramVarArgs.e(16, this.tUZ);
      }
      if (this.tSl != null)
      {
        paramVarArgs.fm(17, this.tSl.aYq());
        this.tSl.a(paramVarArgs);
      }
      paramVarArgs.fk(18, this.tSq);
      if (this.tVa != null) {
        paramVarArgs.e(19, this.tVa);
      }
      if (this.tVb != null) {
        paramVarArgs.e(20, this.tVb);
      }
      paramVarArgs.fk(21, this.tUN);
      if (this.tUO != null) {
        paramVarArgs.e(22, this.tUO);
      }
      GMTrace.o(13171054084096L, 98132);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.eEU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eEU);
      }
      i = paramInt;
      if (this.tUP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tUP);
      }
      i += b.a.a.a.fh(4, this.tUQ);
      paramInt = i;
      if (this.tUR != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tUR);
      }
      i = paramInt;
      if (this.tRz != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tRz);
      }
      paramInt = i;
      if (this.tUS != null) {
        paramInt = i + b.a.a.a.fj(7, this.tUS.aYq());
      }
      i = paramInt;
      if (this.tUT != null) {
        i = paramInt + b.a.a.a.fj(8, this.tUT.aYq());
      }
      paramInt = i;
      if (this.tUU != null) {
        paramInt = i + b.a.a.a.fj(9, this.tUU.aYq());
      }
      i = paramInt;
      if (this.tSm != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.tSm);
      }
      i += b.a.a.a.fh(11, this.tOy);
      paramInt = i;
      if (this.tUV != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tUV);
      }
      i = paramInt + b.a.a.a.fh(13, this.tUW);
      paramInt = i;
      if (this.tUX != null) {
        paramInt = i + b.a.a.a.fj(14, this.tUX.aYq());
      }
      i = paramInt;
      if (this.tUY != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.tUY);
      }
      paramInt = i;
      if (this.tUZ != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.tUZ);
      }
      i = paramInt;
      if (this.tSl != null) {
        i = paramInt + b.a.a.a.fj(17, this.tSl.aYq());
      }
      i += b.a.a.a.fh(18, this.tSq);
      paramInt = i;
      if (this.tVa != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.tVa);
      }
      i = paramInt;
      if (this.tVb != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.tVb);
      }
      i += b.a.a.a.fh(21, this.tUN);
      paramInt = i;
      if (this.tUO != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.tUO);
      }
      GMTrace.o(13171054084096L, 98132);
      return paramInt;
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
      GMTrace.o(13171054084096L, 98132);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gm localgm = (gm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13171054084096L, 98132);
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
          localgm.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 2: 
        localgm.eEU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 3: 
        localgm.tUP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 4: 
        localgm.tUQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 5: 
        localgm.tUR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 6: 
        localgm.tRz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aho();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aho)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgm.tUS = ((aho)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((hz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgm.tUT = ((hz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgm.tUU = ((apx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 10: 
        localgm.tSm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 11: 
        localgm.tOy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 12: 
        localgm.tUV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 13: 
        localgm.tUW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgm.tUX = ((azt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 15: 
        localgm.tUY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 16: 
        localgm.tUZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgm.tSl = ((bdz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 18: 
        localgm.tSq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 19: 
        localgm.tVa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 20: 
        localgm.tVb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      case 21: 
        localgm.tUN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13171054084096L, 98132);
        return 0;
      }
      localgm.tUO = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13171054084096L, 98132);
      return 0;
    }
    GMTrace.o(13171054084096L, 98132);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */