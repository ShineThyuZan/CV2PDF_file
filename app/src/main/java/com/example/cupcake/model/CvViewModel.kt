/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CvViewModel : ViewModel() {

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name
    fun setName(name: String) {
        _name.value = name.ifEmpty { "-" }
    }

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email
    fun setEmail(email: String) {
        _email.value = email.ifEmpty { "-" }
    }

    private val _phone = MutableLiveData<String>()
    val phone: LiveData<String> = _phone
    fun setPhone(phone: String) {
        _phone.value = phone.ifEmpty { "-" }
    }

    private val _address = MutableLiveData<String>()
    val address: LiveData<String> = _address
    fun setAddress(address: String) {
        _address.value = address.ifEmpty { "-" }
    }

    private val _gender = MutableLiveData<String>()
    val gender: LiveData<String> = _gender
    fun setGender(gender: String) {
        _gender.value = gender.ifEmpty { "-" }
    }

    private val _maritalStatus = MutableLiveData<String>()
    val maritalStatus: LiveData<String> = _maritalStatus
    fun setMaritalStatus(maritalStatus: String) {
        _maritalStatus.value = maritalStatus.ifEmpty { "-" }
    }

    private val _school = MutableLiveData<String>()
    val school: LiveData<String> = _school
    fun setSchool(school: String) {
        _school.value = school.ifEmpty { "-" }
    }

    private val _university = MutableLiveData<String>()
    val university: LiveData<String> = _university
    fun setUniversity(university: String) {
        _university.value = university.ifEmpty { "-" }
    }

    private val _skill = MutableLiveData<String>()
    val skill: LiveData<String> = _skill
    fun setSkill(skill: String) {
        _skill.value = skill.ifEmpty { "-" }
    }

    private val _jobExp = MutableLiveData<String>()
    val jobExp: LiveData<String> = _jobExp
    fun setJobExperience(jobExp: String) {
        _jobExp.value = jobExp.ifEmpty { "-" }
    }

    private val _expSalary = MutableLiveData<String>()
    val expSalary: LiveData<String> = _expSalary
    fun setExpSalary(expSalary: String) {
        _expSalary.value = expSalary.ifEmpty { "-" }
    }

//    var userInfo = UserInfoVos(
//        name = name.value!!,
//        email = email.value!!,
//        phone = phone.value!!,
//        address = address.value!!,
//        gender = gender.value!!,
//        marital_status = maritalStatus.value!!,
//        school = school.value!!,
//        university = university.value!!,
//        skill = skill.value!!,
//        experience = jobExp.value!!,
//        exp_salary = expSalary.value!!
//    )

}