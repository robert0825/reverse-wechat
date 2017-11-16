package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vg
  extends ayx
{
  public int oqP;
  public String tWD;
  public String tWE;
  public String tWF;
  public String tWG;
  public String tWH;
  public String tWI;
  
  public vg()
  {
    GMTrace.i(3848693350400L, 28675);
    GMTrace.o(3848693350400L, 28675);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3848827568128L, 28676);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tWD != null) {
        paramVarArgs.e(2, this.tWD);
      }
      if (this.tWE != null) {
        paramVarArgs.e(3, this.tWE);
      }
      if (this.tWF != null) {
        paramVarArgs.e(4, this.tWF);
      }
      if (this.tWG != null) {
        paramVarArgs.e(5, this.tWG);
      }
      if (this.tWH != null) {
        paramVarArgs.e(6, this.tWH);
      }
      paramVarArgs.fk(7, this.oqP);
      if (this.tWI != null) {
        paramVarArgs.e(8, this.tWI);
      }
      GMTrace.o(3848827568128L, 28676);
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
      if (this.tWD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tWD);
      }
      i = paramInt;
      if (this.tWE != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tWE);
      }
      paramInt = i;
      if (this.tWF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWF);
      }
      i = paramInt;
      if (this.tWG != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tWG);
      }
      paramInt = i;
      if (this.tWH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tWH);
      }
      i = paramInt + b.a.a.a.fh(7, this.oqP);
      paramInt = i;
      if (this.tWI != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tWI);
      }
      GMTrace.o(3848827568128L, 28676);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3848827568128L, 28676);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vg localvg = (vg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3848827568128L, 28676);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localvg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848827568128L, 28676);
        return 0;
      case 2: 
        localvg.tWD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3848827568128L, 28676);
        return 0;
      case 3: 
        localvg.tWE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3848827568128L, 28676);
        return 0;
      case 4: 
        localvg.tWF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3848827568128L, 28676);
        return 0;
      case 5: 
        localvg.tWG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3848827568128L, 28676);
        return 0;
      case 6: 
        localvg.tWH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3848827568128L, 28676);
        return 0;
      case 7: 
        localvg.oqP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3848827568128L, 28676);
        return 0;
      }
      localvg.tWI = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3848827568128L, 28676);
      return 0;
    }
    GMTrace.o(3848827568128L, 28676);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\vg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */