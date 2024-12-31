# conuting operation

student = ['andrew','akshat','chris','harsit','lary','tim','drake','ashish','shubham']#0(1)

def randomFunction(students):
    first = students[0]#o(1)
    total = 0#o(1)
    new_list = []#o(1)

    for student in students:
        total += 1#o(n)
        new_list.append(student)#o(n)

    print(new_list)#o(1)
    return total#o(1)

print(randomFunction(student))#o(6+2n)=>o(n)

