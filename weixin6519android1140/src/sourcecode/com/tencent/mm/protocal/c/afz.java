package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afz
  extends azh
{
  public String eLQ;
  public int iXf;
  public bue ucB;
  public String uvC;
  public String uvE;
  public int uvF;
  public LinkedList<apw> uvG;
  public int uvH;
  public String uvI;
  public String uvJ;
  public int uvK;
  public String uvL;
  
  public afz()
  {
    GMTrace.i(4001969995776L, 29817);
    this.uvG = new LinkedList();
    GMTrace.o(4001969995776L, 29817);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4002104213504L, 29818);
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
      if (this.ucB != null)
      {
        paramVarArgs.fm(2, this.ucB.aYq());
        this.ucB.a(paramVarArgs);
      }
      if (this.uvE != null) {
        paramVarArgs.e(3, this.uvE);
      }
      paramVarArgs.fk(4, this.uvF);
      paramVarArgs.fk(5, this.iXf);
      if (this.uvC != null) {
        paramVarArgs.e(6, this.uvC);
      }
      paramVarArgs.d(7, 8, this.uvG);
      paramVarArgs.fk(8, this.uvH);
      if (this.uvI != null) {
        paramVarArgs.e(9, this.uvI);
      }
      if (this.uvJ != null) {
        paramVarArgs.e(10, this.uvJ);
      }
      paramVarArgs.fk(11, this.uvK);
      if (this.eLQ != null) {
        paramVarArgs.e(12, this.eLQ);
      }
      if (this.uvL != null) {
        paramVarArgs.e(13, this.uvL);
      }
      GMTrace.o(4002104213504L, 29818);
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
      if (this.ucB != null) {
        paramInt = i + b.a.a.a.fj(2, this.ucB.aYq());
      }
      i = paramInt;
      if (this.uvE != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uvE);
      }
      i = i + b.a.a.a.fh(4, this.uvF) + b.a.a.a.fh(5, this.iXf);
      paramInt = i;
      if (this.uvC != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uvC);
      }
      i = paramInt + b.a.a.a.c(7, 8, this.uvG) + b.a.a.a.fh(8, this.uvH);
      paramInt = i;
      if (this.uvI != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uvI);
      }
      i = paramInt;
      if (this.uvJ != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uvJ);
      }
      i += b.a.a.a.fh(11, this.uvK);
      paramInt = i;
      if (this.eLQ != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.eLQ);
      }
      i = paramInt;
      if (this.uvL != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.uvL);
      }
      GMTrace.o(4002104213504L, 29818);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uvG.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4002104213504L, 29818);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afz localafz = (afz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4002104213504L, 29818);
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
          localafz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bue();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bue)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localafz.ucB = ((bue)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 3: 
        localafz.uvE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 4: 
        localafz.uvF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 5: 
        localafz.iXf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 6: 
        localafz.uvC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localafz.uvG.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 8: 
        localafz.uvH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 9: 
        localafz.uvI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 10: 
        localafz.uvJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 11: 
        localafz.uvK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      case 12: 
        localafz.eLQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4002104213504L, 29818);
        return 0;
      }
      localafz.uvL = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4002104213504L, 29818);
      return 0;
    }
    GMTrace.o(4002104213504L, 29818);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\afz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */