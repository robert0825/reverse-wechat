package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bhx
  extends ayx
{
  public String ugx;
  public String umF;
  public String umG;
  public String umH;
  public String urE;
  
  public bhx()
  {
    GMTrace.i(3748566925312L, 27929);
    GMTrace.o(3748566925312L, 27929);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3748701143040L, 27930);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.umF != null) {
        paramVarArgs.e(2, this.umF);
      }
      if (this.urE != null) {
        paramVarArgs.e(3, this.urE);
      }
      if (this.umG != null) {
        paramVarArgs.e(4, this.umG);
      }
      if (this.umH != null) {
        paramVarArgs.e(5, this.umH);
      }
      if (this.ugx != null) {
        paramVarArgs.e(6, this.ugx);
      }
      GMTrace.o(3748701143040L, 27930);
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
      if (this.umF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.umF);
      }
      i = paramInt;
      if (this.urE != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.urE);
      }
      paramInt = i;
      if (this.umG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.umG);
      }
      i = paramInt;
      if (this.umH != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.umH);
      }
      paramInt = i;
      if (this.ugx != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ugx);
      }
      GMTrace.o(3748701143040L, 27930);
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
      GMTrace.o(3748701143040L, 27930);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bhx localbhx = (bhx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3748701143040L, 27930);
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
          localbhx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3748701143040L, 27930);
        return 0;
      case 2: 
        localbhx.umF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748701143040L, 27930);
        return 0;
      case 3: 
        localbhx.urE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748701143040L, 27930);
        return 0;
      case 4: 
        localbhx.umG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748701143040L, 27930);
        return 0;
      case 5: 
        localbhx.umH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3748701143040L, 27930);
        return 0;
      }
      localbhx.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3748701143040L, 27930);
      return 0;
    }
    GMTrace.o(3748701143040L, 27930);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bhx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */