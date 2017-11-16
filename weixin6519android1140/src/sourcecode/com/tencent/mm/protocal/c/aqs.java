package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqs
  extends azh
{
  public String gjJ;
  public LinkedList<aqt> uGT;
  public String uGU;
  public boolean uGV;
  public boolean uGW;
  public boolean uGX;
  public String ubQ;
  
  public aqs()
  {
    GMTrace.i(17871358918656L, 133152);
    this.uGT = new LinkedList();
    GMTrace.o(17871358918656L, 133152);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17871493136384L, 133153);
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
      paramVarArgs.d(3, 8, this.uGT);
      if (this.gjJ != null) {
        paramVarArgs.e(4, this.gjJ);
      }
      if (this.uGU != null) {
        paramVarArgs.e(5, this.uGU);
      }
      if (this.ubQ != null) {
        paramVarArgs.e(6, this.ubQ);
      }
      paramVarArgs.ah(8, this.uGV);
      paramVarArgs.ah(9, this.uGW);
      paramVarArgs.ah(10, this.uGX);
      GMTrace.o(17871493136384L, 133153);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(3, 8, this.uGT);
      paramInt = i;
      if (this.gjJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gjJ);
      }
      i = paramInt;
      if (this.uGU != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uGU);
      }
      paramInt = i;
      if (this.ubQ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ubQ);
      }
      i = b.a.a.b.b.a.cK(8);
      int j = b.a.a.b.b.a.cK(9);
      int k = b.a.a.b.b.a.cK(10);
      GMTrace.o(17871493136384L, 133153);
      return paramInt + (i + 1) + (j + 1) + (k + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uGT.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17871493136384L, 133153);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqs localaqs = (aqs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 2: 
      case 7: 
      default: 
        GMTrace.o(17871493136384L, 133153);
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
          localaqs.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqs.uGT.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 4: 
        localaqs.gjJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 5: 
        localaqs.uGU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 6: 
        localaqs.ubQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 8: 
        localaqs.uGV = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      case 9: 
        localaqs.uGW = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(17871493136384L, 133153);
        return 0;
      }
      localaqs.uGX = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(17871493136384L, 133153);
      return 0;
    }
    GMTrace.o(17871493136384L, 133153);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */